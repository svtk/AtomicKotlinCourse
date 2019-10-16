package moreLibraryFunctionsExercise2

import atomictest.eq

fun fibonacciNumbers(): Sequence<Int> {
  var previous = 1
  return generateSequence(0) { current ->
    val next = previous + current
    previous = current
    next
  }
}

fun main() {
  fibonacciNumbers().take(10).toList() eq
      listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
}