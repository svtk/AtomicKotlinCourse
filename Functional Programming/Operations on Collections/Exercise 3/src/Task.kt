package operationsOnCollections.exercise3

import atomictest.eq

fun sum(list: List<Int?>): Int {
  return list.filterNotNull().sum()
}

fun main() {
  sum(listOf(1, 2, null)) eq 3
}