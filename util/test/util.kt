package util

import atomictest.trace
import org.junit.Assert
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.reflect.Field
import java.lang.reflect.Method
import kotlin.reflect.*
import kotlin.reflect.full.createType
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.test.assertEquals
import kotlin.test.assertTrue

const val TIMEOUT = 3000L

val LINE_SEPARATOR: String = System.getProperty("line.separator")

fun unimplementedTest() {
    Assert.assertTrue("Tests not implemented for the task", false)
}

fun String.normalizeLineSeparators(): String {
    return replace("\\R".toRegex(), LINE_SEPARATOR)
}

inline fun runAndGetSystemOutput(action: () -> Unit): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    action()

    return byteArrayOutputStream.toString()
}

fun loadTraceContent(): List<String> {
    return trace::class.members
            .first { it.name == "trc" }
            .apply { isAccessible = true }
            .let { it.call() as List<String> }
}

inline fun runAndCheckSystemOutput(message: String, expectedOutput: String, action: () -> Unit) {
    val actual = runAndGetSystemOutput(action)
    checkSystemOutput(message, expectedOutput, actual)
}

fun checkSystemOutput(message: String, expected: String, actual: String) {
    Assert.assertEquals(message, expected.trim().normalizeLineSeparators(), actual.trim().normalizeLineSeparators())
}

fun checkInputOutput(message: String, expectedInputAndOutput: String, action: () -> Unit) {
    val (inputLines, outputLines) = expectedInputAndOutput
            .lines()
            .partition { it.startsWith(">>>") }
    val input = inputLines.joinToString(LINE_SEPARATOR) { it.substringAfter(">>> ") }
    val expectedOutput = outputLines.joinToString(LINE_SEPARATOR)

    checkInputOutput(message, input, expectedOutput, action)
}

fun checkInputOutput(message: String, input: String, expectedOutput: String, action: () -> Unit) {
    val inputStream = ByteArrayInputStream(input.toByteArray())
    System.setIn(inputStream)

    val out = ByteArrayOutputStream()
    System.setOut(PrintStream(out))

    action()

    checkSystemOutput(message, expectedOutput, out.toString())
}


private fun assertKType(actualKType: KType, expectedKType: KType, what: () -> String) {
    if (actualKType != expectedKType) {
        incorrectTypeError(actualKType.toString(), expectedKType.toString(), what())
    }
}

private fun incorrectTypeError(actualType: String, expectedType: String, what: String): Nothing {
    throw AssertionError("Expected type of $what: $expectedType, found: $actualType")
}

private fun notFoundError(what: String, where: String): Nothing {
    throw AssertionError("Can't find the $what in $where")
}

private fun tooManyError(what: String, where: String): Nothing {
    throw AssertionError("Expected only one $what in $where")
}

private fun falseFoundError(what: String, where: String): Nothing {
    throw AssertionError("Did not expect to find $what in $where")
}

private fun <T> List<T>.checkFoundEntities(what: String, where: String): List<T> {
    if (isEmpty()) notFoundError(what, where)
    if (size > 1) tooManyError(what, where)
    return this
}

private fun <T> List<T>.checkNotFoundEntities(what: String, where: String): List<T> {
    if (isNotEmpty()) falseFoundError(what, where)
    return this
}

inline fun <reified T> createInstance(vararg args: Any?): T {
    val className = T::class.simpleName
            ?: throw AssertionError("Class should not be an anonymous object literal")
    val packageName = T::class.qualifiedName
            ?.substringBeforeLast('.')
            ?: throw AssertionError("Class should not be local or an anonymous object literal")
    return loadClass(packageName, className).constructors.firstOrNull()?.call(*args) as T
            ?: throw AssertionError("Class $className should define at least one constructor")
}

fun loadClass(packageName: String, className: String): KClass<*> {
    return try {
        ClassLoader.getSystemClassLoader().loadClass("$packageName.$className").kotlin
    } catch (e: ClassNotFoundException) {
        notFoundError(what = "the '$className' class", where = "'$packageName' package")
    }
}

fun assertInheritance(derivedClass: KClass<*>, baseClass: KClass<*>) {
    assertTrue(
            actual = derivedClass.supertypes.contains(baseClass.createType()),
            message = "${derivedClass.simpleName} should inherit ${baseClass.simpleName}"
    )
}

fun assertInheritance(derivedClass: KClass<*>, baseClassNames: List<String>) {
    val packageName = derivedClass.qualifiedName!!
            .removeSuffix(derivedClass.simpleName!!)
            .removeSuffix(".")
    baseClassNames.forEach { className ->
        val baseClass = loadClass(packageName, className)
        assertTrue(
                actual = derivedClass.supertypes.contains(baseClass.createType()),
                message = "${derivedClass.simpleName} should inherit ${baseClass.simpleName}"
        )
    }
}

fun loadMemberFunction(kClass: KClass<*>, methodName: String): KFunction<*> {
    return kClass.memberFunctions
            .filter { it.name == methodName }
            .checkFoundEntities(what = "the '$methodName()' member function", where = "'${kClass.simpleName}' class")
            .single()
}

fun assertNoMemberFunction(kClass: KClass<*>, methodName: String) {
    kClass.memberFunctions
            .filter { it.name == methodName }
            .checkNotFoundEntities("the '$methodName' member function", "'${kClass.simpleName}' class")
}

fun loadMemberProperty(kClass: KClass<*>, propertyName: String): KProperty<*> {
    return kClass.memberProperties
            .filter { it.name == propertyName }
            .checkFoundEntities("the '$propertyName' member property", "'${kClass.simpleName}' class")
            .single()
}

fun assertNoMemberProperty(kClass: KClass<*>, propertyName: String) {
    kClass.memberProperties
            .filter { it.name == propertyName }
            .checkNotFoundEntities("the '$propertyName' member property", "'${kClass.simpleName}' class")
}

fun loadMemberPropertyWithType(kClass: KClass<*>, propertyName: String, expectedType: KType): KProperty<*> {
  return kClass.memberProperties
          .filter { it.name == propertyName }
          .checkFoundEntities("the '$propertyName' member property", "'${kClass.simpleName}' class")
          .single()
          .also { property ->
            assertKType(actualKType = property.returnType, expectedKType = expectedType) {
              "'${kClass.simpleName}.${propertyName}' property"
            }
          }
}

fun loadAssertedMemberProperty(kClass: KClass<*>, propertyName: String, expectedType: KClass<*>): KProperty<*> {
    return loadMemberPropertyWithType(kClass, propertyName, expectedType.createType())
}

class KFileFacade(val packageName: String, val fileName: String, val jClass: Class<*>)

fun loadFileFacade(packageName: String, fileName: String = "Task"): KFileFacade {
    return try {
        KFileFacade(packageName, fileName,
                ClassLoader.getSystemClassLoader().loadClass("$packageName.${fileName.capitalize()}Kt"))
    } catch (e: ClassNotFoundException) {
        notFoundError(what = "'$fileName.kt' file", where = "'$packageName' package")
    }
}

fun loadToplevelField(fileFacade: KFileFacade, memberName: String): Field {
    return fileFacade.jClass.declaredFields
            .filter { it.name == memberName }
            .checkFoundEntities(
                    what = "'$memberName' value",
                    where = "'${fileFacade.fileName}.kt' file"
            ).single()
}

private fun loadToplevelMember(fileFacade: KFileFacade, memberName: String, isGetter: Boolean): Method {
    val name = if (isGetter && !memberName.startsWith("is"))
        "get" + memberName.capitalize()
    else
        memberName
    return fileFacade.jClass.declaredMethods
            .filter { it.name == name }
            .checkFoundEntities(
                    what = if (isGetter) "'$memberName' property" else "'$memberName()' function",
                    where = "'${fileFacade.fileName}.kt' file"
            ).single()
}

fun loadToplevelFunction(fileFacade: KFileFacade, functionName: String): Method {
    return loadToplevelMember(fileFacade, functionName, false)
}

fun loadToplevelPropertyGetter(fileFacade: KFileFacade, propertyName: String): Method {
    return loadToplevelMember(fileFacade, propertyName, true)
}

fun loadMainFunction(fileFacade: KFileFacade): Method {
    return fileFacade.jClass.declaredMethods
            .filter { it.name == "main" }
            .let { mains ->
                when (mains.size) {
                    0 -> null
                    1 -> mains.single()
                    else -> mains.find { it.parameters.isEmpty() }
                }
            } ?: notFoundError(what = "'main' function", where = "'${fileFacade.fileName}.kt' file")
}

fun KClass<*>.assertConstructorNumber(expectedNumber: Int) {
    val expectedMessage = {
        when (expectedNumber) {
            0 -> "no constructors"
            1 -> "only one constructor"
            else -> "$expectedNumber constructors"
        }
    }
    assertEquals(
            expected = expectedNumber,
            actual = constructors.size,
            message = "Expected class '${simpleName}' to have ${expectedMessage()}"
    )
}

fun KClass<*>.assertParametersOfFirstConstructor(vararg params: Pair<String, KClass<*>>) {
    val constructor = constructors.first()
    val paramsStr = params.map { it.first to it.second.qualifiedName!! }
    checkParametersOfConstructor(constructor, this, paramsStr)
}

fun KClass<*>.assertParametersOfConstructor(constructor: KFunction<*>, vararg params: Pair<String, KClass<*>>) {
    val paramsStr = params.map { it.first to it.second.qualifiedName!! }
    checkParametersOfConstructor(constructor, this, paramsStr)
}

fun KClass<*>.createInstance(vararg args: Any?): Any {
    return constructors.first().call(*args)
}

private fun checkParametersOfConstructor(
        constructor: KFunction<*>,
        kClass: KClass<*>,
        params: List<Pair<String, String>>
) {
    checkParameters("constructor of '${kClass.simpleName}'", constructor, params, isTopLevel = true)
}

fun checkParametersOfTopLevelFunction(
        function: KFunction<*>,
        params: List<Pair<String, String>>
) {
    checkParameters("function '${function.name}'", function, params, isTopLevel = true)
}

fun checkParametersOfMemberFunction(
        function: KFunction<*>,
        params: List<Pair<String, String>>
) {
    checkParameters("function '${function.name}'", function,
            listOf("" to "") // this parameter refers to a class and ignored while checking
                    + params,
            isTopLevel = false)
}

private fun checkParameters(
        funcOrConstructorName: String,
        function: KFunction<*>,
        params: List<Pair<String, String>>,
        isTopLevel: Boolean
) {
    // excluding an extra parameter from checking
    fun Int.decIfMember() = if (isTopLevel) this else this - 1

    val expectedSize = params.size.decIfMember()
    val actualSize = function.parameters.size.decIfMember()
    assertEquals(
            expected = expectedSize,
            actual = actualSize,
            message = "${funcOrConstructorName.capitalize()} is expected to have $expectedSize parameter(s)"
    )

    val expectedParams = params.toList()
    function.parameters.forEachIndexed { index, kParameter ->
        val (name, type) = expectedParams[index]

        checkParameter(index, name, type, kParameter, funcOrConstructorName)
    }
}

private fun checkParameter(index: Int, name: String, type: String, param: KParameter, funcName: String) {
    val ordinal = when (index) {
        0 -> "first"
        1 -> "second"
        2 -> "third"
        3 -> "forth"
        5 -> "fifth"
        else -> "$index"
    }
    if (name.isNotEmpty()) {
        Assert.assertEquals("Expected the $ordinal parameter named '$name' for ${funcName.decapitalize()}",
                name, param.name)
        Assert.assertEquals("Expected the parameter '$name' of type '$type' for ${funcName.decapitalize()}",
                type, param.type.toString())
    }
    // type is empty for first parameter of member functions, where class instance is passes at first
    // this case isn't tested explicitly to avoid mysterious messages for students
    else if (type.isNotEmpty()) {
        Assert.assertEquals("Expected the $ordinal parameter of type '$type' for ${funcName.decapitalize()}",
                type, param.type.toString())
    }
}

fun checkFunctionIsExtension(function: Method, expectedReceiver: KClass<*>) {
    checkFunctionOrPropertyIsExtension(function, expectedReceiver, isGetter = false)
}

fun checkPropertyIsExtension(propertyGetter: Method, expectedReceiver: KClass<*>) {
    checkFunctionOrPropertyIsExtension(propertyGetter, expectedReceiver, isGetter = true)
}

private fun checkFunctionOrPropertyIsExtension(
        functionOrGetter: Method, expectedReceiver: KClass<*>, isGetter: Boolean
) {
    val name = functionOrGetter.name
    val callable = if (isGetter) "property" else "function"
    Assert.assertTrue("The '$name' $callable must be an *extension* $callable",
            functionOrGetter.parameters.size == 1)
    Assert.assertTrue("Wrong receiver for '$name': should be '${expectedReceiver.simpleName}'",
            expectedReceiver.java == functionOrGetter.parameters.single().type)
}

fun untestable() {
    Assert.assertTrue("No tests: tests always pass", true)
}

inline fun checkMainIsImplemented(main: () -> Unit) {
    try {
        main()
    } catch (e: NotImplementedError) {
        throw AssertionError("The 'main' function is not implemented")
    }
}
