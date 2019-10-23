package namedAndDefaultArgumentsExercise3

import atomictest.eq

fun joinComments(s: String): String =
  s.trimMargin("// ").lines().joinToString("; ")

fun main() {
  val s = """
        // first
        // second
        // third
        """
  joinComments(s) eq "first; second; third"
}