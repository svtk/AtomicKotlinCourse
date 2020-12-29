// IfExpressions/Task4.kt
package ifExpressionsExercise4

fun oneOrTheOther(exp: Boolean) =
  if (exp)
    "True!"
  else
    "False"

fun main() {
  val x = 1
  println(oneOrTheOther(x == 1))  // True!
}