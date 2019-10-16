package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val tmp = x
  x = y
  y = tmp
  println(x)
  println(y)
}