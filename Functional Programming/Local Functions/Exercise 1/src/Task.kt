package localFunctionsExercise1

fun f(): Int {
  fun g(): Int {
    fun h() = 47
    return h()
  }
  return g()
}

fun main() {
  println(f())
}