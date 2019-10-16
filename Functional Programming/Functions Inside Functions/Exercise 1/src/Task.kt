package functionsInsideFunctionsExercise1

import atomictest.eq

fun <T> List<T>.find(predicate: (T) -> Boolean): T? {
  forEach {
    if (predicate(it)) return it
  }
  return null
}

fun main() {
  listOf(1, 2, 3).find { it < 0 } eq null
  listOf(1, -2, -3).find { it < 0 } eq -2
}