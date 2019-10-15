package summaryII.exercise9

fun va1(vararg ints: Int) {
  va2(*ints)
  for (i in ints) {
    println("va1: $i")
  }
}

fun va2(vararg ints: Int) {
  for (i in ints) {
    println("va2: $i")
  }
}

fun main() {
  va1(1, 2, 3)
  va2(4, 5, 6)
}