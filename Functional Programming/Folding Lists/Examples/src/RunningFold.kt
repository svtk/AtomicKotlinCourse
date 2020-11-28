// FoldingLists/RunningFold.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 10, 100, 1000)
  list.runningFold(0) { sum, n ->
    sum + n
  } eq listOf(0, 1, 11, 111, 1111)

  list.runningReduce { sum, n ->
    sum + n
  } eq listOf(1, 11, 111, 1111)
}