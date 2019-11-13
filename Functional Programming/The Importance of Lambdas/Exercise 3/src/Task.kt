package theImportanceOfLambdasExercise3

import atomictest.eq

fun other(s: String): String =
  s.filterIndexed { index, _ -> index % 2 == 0 }

fun main() {
  other("cement") eq "cmn"
}