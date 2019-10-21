package variableArgumentListsExercise2

fun printArgs(s: String, vararg ints: Int) {
  println("$s${ints.toList()}")
}

fun main() {
  printArgs("Numbers: ", 1, 2, 3)
}
/* Output:
Numbers: [1, 2, 3]
 */