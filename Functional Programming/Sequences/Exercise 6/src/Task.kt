// Sequences/School3.kt
package sequencesExercise6

import atomictest.eq

fun from(n: Int): Sequence<Int> = generateSequence(n) { it + 1 }

fun main() {
  from(10).take(2).toList() eq listOf(10, 11)
}