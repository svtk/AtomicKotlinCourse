// ExtensionFunctions/Task2.kt
package extensionFunctionsExercise2
import atomictest.eq

fun Int.isOdd(): Boolean = (this and 1) == 1

fun Int.isEven(): Boolean = !isOdd()

fun main() {
  1.isOdd() eq true
  2.isEven() eq true
  13.isEven() eq false
  (-7).isOdd() eq true
}