// ComplexConstructors/Exercise3.kt
package complexConstructorsExercise3
import atomictest.eq

class MultipleInit() {
  var result: String
  init {
    result = "one "
  }
  init {
    result += "two "
  }
  init {
    result += "three"
  }
}

fun main() {
  MultipleInit().result eq "one two three"
}