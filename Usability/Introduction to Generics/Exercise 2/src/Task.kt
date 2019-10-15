package introductionToGenerics2

import atomictest.eq

fun <T> List<T>.reversed(): List<T> {
  val result = mutableListOf<T>()
  for (i in lastIndex downTo 0) {
    result += get(i)
  }
  return result
}

fun main() {
  val list = listOf(1, 2, 3)
  list.reversed() eq listOf(3, 2, 1)
}