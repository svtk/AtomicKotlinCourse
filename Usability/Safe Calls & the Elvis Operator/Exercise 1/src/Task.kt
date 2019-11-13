package safeCallsAndTheElvisOperatorExercise1

import atomictest.eq

fun downcase(s: String?): String = s?.toLowerCase() ?: ""

fun main() {
  downcase(null) eq ""
  downcase("ABC") eq "abc"
}