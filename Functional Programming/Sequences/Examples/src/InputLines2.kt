// Sequences/InputLines2.kt
package sequences

fun main() {
  val lines = generateSequence {
    readLine()?.takeIf { it != "XXX" }
  }
  println(lines.toList())
}
/* Input/Output:
>>> first
>>> second
>>> XXX
[first, second]
*/