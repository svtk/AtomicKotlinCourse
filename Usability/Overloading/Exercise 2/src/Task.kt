package overloadingExercise2

import atomictest.eq

fun f(n: Int = 0) = n + 373

fun main() {
  f() eq 373
}