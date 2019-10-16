package expressionsAndStatementsExercise2

fun f() = println("f()")

fun g(i: Int, j: Int) = i + j

fun h(s1: String, s2: String) = s1 + s2

fun main() {
  val fVal: Unit = f()
  val gVal: Int = g(1, 2)
  val hVal: String = h("a", "bc")
}