// Sequences/Task4.kt
package sequencesExercise7

fun oddWithout1(): Sequence<Int> {
  return generateSequence(1) { it + 2 }
    .filter { '1' !in it.toString() }
}

fun main() {
  println(oddWithout1().take(20).sum())
}
