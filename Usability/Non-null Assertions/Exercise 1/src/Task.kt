package nonNullAssertions.exercise1

import atomictest.eq

fun sumOfFirstAndLast(list: List<Int>): Int =
  when {
      list.isEmpty() -> 0
      list.size == 1 -> list.first()
      else -> list.first() + list.last()
    }

fun main() {
  sumOfFirstAndLast(listOf()) eq 0
  sumOfFirstAndLast(listOf(1)) eq 1
  sumOfFirstAndLast(listOf(1, 2)) eq 3
  sumOfFirstAndLast(listOf(1, 2, 3)) eq 4
}