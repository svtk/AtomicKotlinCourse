// Sequences/NoComputationYet.kt
import atomictest.eq
import sequences.*

fun main() {
  val r = listOf(1, 2, 3, 4)
    .asSequence()
    .filter(Int::isEven)
    .map(Int::square)
  r.toString().substringBefore("@") eq
    "kotlin.sequences.TransformingSequence"
}