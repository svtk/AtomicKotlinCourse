package util

import org.junit.Assert
import java.io.ByteArrayOutputStream
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

fun assertEqualsForOutput(message: String, expected: String, actual: ByteArrayOutputStream) {
  Assert.assertEquals(message, expected.trim().normalizeLineSeparators(), actual.toString().trim().normalizeLineSeparators())
}

fun loadClass(packageName: String, className: String): KClass<*> {
  return try {
    ClassLoader.getSystemClassLoader().loadClass("$packageName.$className").kotlin
  } catch (e: ClassNotFoundException) {
    throw AssertionError("Can't find the '$className' class in '$packageName' package")
  }
}

fun loadMethod(kClass: KClass<*>, methodName: String): KFunction<*> {
  fun error(): Nothing {
    throw AssertionError("Can't find the '$methodName()' member function in '${kClass.simpleName}' class")
  }
  return try {
    kClass.memberFunctions.find { it.name == methodName } ?: error()
  } catch (e: NoSuchMethodException) {
    error()
  }
}

fun loadProperty(kClass: KClass<*>, propertyName: String): KProperty<*> {
  fun error(): Nothing {
    throw AssertionError("Can't find the '$propertyName' member property in '${kClass.simpleName}' class")
  }
  return try {
    kClass.memberProperties.find { it.name == propertyName } ?: error()
  } catch (e: NoSuchMethodException) {
    error()
  }
}