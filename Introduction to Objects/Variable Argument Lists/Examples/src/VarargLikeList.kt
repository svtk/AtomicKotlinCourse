// Varargs/VarargLikeList.kt
package varargs

fun evaluate(vararg ints: Int) {
  println("Size: ${ints.size}")
  println("Sum: ${ints.sum()}")
  println("Average: ${ints.average()}")
}

fun main() {
  evaluate(10, -3, 8, 1, 9)
}
/* Output:
Size: 5
Sum: 25
Average: 5.0
*/