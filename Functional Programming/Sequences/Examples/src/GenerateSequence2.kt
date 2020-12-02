// Sequences/GenerateSequence2.kt
import atomictest.eq

fun main() {
  val inputs = mutableListOf(
    "first", "second", "third", "XXX", "4th")
  val lines = generateSequence {
    inputs.removeAt(0).takeIf { it != "XXX" }
  }
  lines.toList() eq "[first, second, third]"
}