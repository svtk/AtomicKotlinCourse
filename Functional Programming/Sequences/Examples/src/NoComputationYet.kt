// Sequences/NoComputationYet.kt
import atomictest.eq
import usingsequences.*

fun main() {
  val r = listOf(1, 2, 3, 4)
    .asSequence()
    .filter(Int::isEven)
    .map(Int::square)
  r.toString().split("@")[0] eq
    "kotlin.sequences.TransformingSequence"
}