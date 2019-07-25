package libraryhelpers

import atomictest.eq

fun transformVersion1(list: List<Int>): List<Int> {
  val intermediateResult = list
      .filter { it % 2 == 1 }
      .map { it * it }
  return intermediateResult.subList(
      1, intermediateResult.size)
}

fun transformVersion2(list: List<Int>): List<Int> {
  return list
      .filter { it % 2 == 1 }
      .map { it * it }
      .run { subList(1, size) }
}

fun main() {
  transformVersion1(listOf(1, 2, 3, 4, 5)) eq listOf(9, 25)
  transformVersion2(listOf(1, 2, 3, 4, 5)) eq listOf(9, 25)
}