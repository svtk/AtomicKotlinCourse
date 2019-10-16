package lambdaWithReceiverExercise2

import atomictest.eq

fun buildList(action: MutableList<Int>.() -> Unit): List<Int> {
  val list = mutableListOf<Int>()
  list.action()
  return list
}

fun main() {
  val list = buildList {
    add(0)
    for (i in 1..5) {
      add(i)
    }
  }
  list eq listOf(0, 1, 2, 3, 4, 5)
}