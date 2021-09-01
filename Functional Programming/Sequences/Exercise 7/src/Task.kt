// Sequences/Task7.kt
package sequencesExercise7

fun oddWithoutDigitOne(): Sequence<Int> {
  return generateSequence(3) { it + 2 }
    .filter { '1' !in it.toString() }
}

fun main() {
  println(oddWithoutDigitOne().take(20).sum())
}