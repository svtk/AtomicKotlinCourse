// ComplexConstructors/Exercise3.kt
package complexConstructorsExercise3
import atomictest.eq

class MultipleInit {
  val list = mutableListOf<String>()
  init {
    list += "one"
  }
  init {
    list += "two"
  }
  init {
    list += "three"
  }
}

fun main() {
  MultipleInit().list eq "one two three"
}