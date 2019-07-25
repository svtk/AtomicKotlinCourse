package util

import org.junit.Assert
import java.io.ByteArrayOutputStream

val LINE_SEPARATOR: String = System.getProperty("line.separator")

fun String.normalizeLineSeparators(): String {
  return replace("\\R".toRegex(), LINE_SEPARATOR)
}

fun assertEqualsForOutput(message: String, expected: String, actual: ByteArrayOutputStream) {
  Assert.assertEquals(message, expected.trim().normalizeLineSeparators(), actual.toString().trim().normalizeLineSeparators())
}