// IfExpressions/Task3.kt
package ifExpressionsExercise3

fun findMax(first: Int, second: Int): Int =
  if (first > second) first else second

fun main() {
  println(findMax(-1, 4))  // 4
}