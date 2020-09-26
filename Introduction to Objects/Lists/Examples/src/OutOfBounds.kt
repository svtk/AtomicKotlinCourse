// Lists/OutOfBounds.kt
package lists
import atomictest.*

fun main() {
  val ints = listOf(1, 2, 3)
  capture {
    ints[3]
  } eq "ArrayIndexOutOfBoundsException: " +
    "Index 3 out of bounds for length 3"
}