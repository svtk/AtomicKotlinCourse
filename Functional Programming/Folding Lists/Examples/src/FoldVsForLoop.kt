// FoldingLists/FoldVsForLoop.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 10, 100, 1000)
  var accumulator = 0
  val operation =
    { sum: Int, i: Int -> sum + i }
  for (i in list) {
    accumulator = operation(accumulator, i)
  }
  accumulator eq 1111
}