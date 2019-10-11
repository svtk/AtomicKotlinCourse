package summary4

fun first(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) b && c else false

fun second(a: Boolean, b: Boolean, c: Boolean): Boolean =
  if (a) true else b || c

fun main() {
  println(first(true, true, true))
  println(first(true, false, true))

  println(second(false, false, false))
  println(second(false, true, false))
}