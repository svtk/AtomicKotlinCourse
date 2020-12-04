// LocalFunctions/Task1.kt
package localFunctionsExercise1
import atomictest.eq

fun f(): Int {
  fun g(): Int {
    fun h() = 47
    return h()
  }
  return g()
}

fun main() {
  f() eq 47
}