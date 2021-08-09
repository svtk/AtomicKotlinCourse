// ComplexConstructors/Exercise2.kt
package complexConstructorsExercise2
import atomictest.eq

class SumChars(text: String) {
  val sum: Int
  init {
    fun calc() = text.sumOf { it.code }
    sum = calc()
  }
}

fun main() {
  SumChars("What?").sum eq 467
}