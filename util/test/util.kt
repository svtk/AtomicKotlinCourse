package util

import org.junit.Assert
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.reflect.Method
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KProperty
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

const val TIMEOUT = 3000L

val LINE_SEPARATOR: String = System.getProperty("line.separator")

fun String.normalizeLineSeparators(): String {
  return replace("\\R".toRegex(), LINE_SEPARATOR)
}

inline fun runAndGetSystemOutput(action: () -> Unit): String {
  val byteArrayOutputStream = ByteArrayOutputStream()
  System.setOut(PrintStream(byteArrayOutputStream))

  action()

  return byteArrayOutputStream.toString()
}

inline fun runAndCheckSystemOutput(message: String, expectedOutput: String, action: () -> Unit) {
  val actual = runAndGetSystemOutput(action)
  checkSystemOutput(message, expectedOutput, actual)
}

fun checkSystemOutput(message: String, expected: String, actual: String) {
  Assert.assertEquals(message, expected.trim().normalizeLineSeparators(), actual.trim().normalizeLineSeparators())
}

fun loadClass(packageName: String, className: String): KClass<*> {
  return try {
    ClassLoader.getSystemClassLoader().loadClass("$packageName.$className").kotlin
  } catch (e: ClassNotFoundException) {
    throw AssertionError("Can't find the '$className' class in '$packageName' package")
  }
}

fun loadMemberFunction(kClass: KClass<*>, methodName: String): KFunction<*> {
  fun error(): Nothing {
    throw AssertionError("Can't find the '$methodName()' member function in '${kClass.simpleName}' class")
  }
  return try {
    kClass.memberFunctions.find { it.name == methodName } ?: error()
  } catch (e: NoSuchMethodException) {
    error()
  }
}

fun loadMemberProperty(kClass: KClass<*>, propertyName: String): KProperty<*> {
  fun error(): Nothing {
    throw AssertionError("Can't find the '$propertyName' member property in '${kClass.simpleName}' class")
  }
  return try {
    kClass.memberProperties.find { it.name == propertyName } ?: error()
  } catch (e: NoSuchMethodException) {
    error()
  }
}

class KFileFacade(val packageName: String, val fileName: String, val jClass: Class<*>)

fun loadFileFacade(packageName: String, fileName: String): KFileFacade {
  return try {
    KFileFacade(packageName, fileName,
      ClassLoader.getSystemClassLoader().loadClass("$packageName.${fileName.capitalize()}Kt"))
  } catch (e: ClassNotFoundException) {
    throw AssertionError("Can't find the '$fileName.kt' file in '$packageName' package")
  }
}

private fun loadToplevelMember(fileFacade: KFileFacade, memberName: String, isGetter: Boolean): Method {
  fun error(): Nothing {
    val obj = if (isGetter) "'$memberName' property" else "'$memberName()' function"
    throw AssertionError("Can't find the $obj in '${fileFacade.fileName}.kt' file")
  }
  return try {
    val name = if (isGetter) "get" + memberName.capitalize() else memberName
    fileFacade.jClass.declaredMethods.find { it.name == name } ?: error()
  } catch (e: NoSuchMethodException) {
    error()
  }
}

fun loadToplevelFunction(fileFacade: KFileFacade, functionName: String): Method {
  return loadToplevelMember(fileFacade, functionName, false)
}

fun loadToplevelPropertyGetter(fileFacade: KFileFacade, propertyName: String): Method {
  return loadToplevelMember(fileFacade, propertyName, true)
}