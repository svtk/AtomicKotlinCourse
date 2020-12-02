// Exceptions/Task3.kt
package exceptionsExercise3

import atomictest.capture
import atomictest.eq

fun repeatChar(c: Char, n: Int): String {
  if (n < 0)
    throw IllegalArgumentException("Count 'n' must be non-negative, but was $n.")
  var s = ""
  repeat(n) {
    s += c
  }
  return s
}

fun main() {
  repeatChar('a', 4) eq "aaaa"
  capture {
    repeatChar('c', -2)
  } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}