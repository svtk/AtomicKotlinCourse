// Packages/EquilateralTriangle.kt
package pythagorean
import kotlin.math.sqrt

class EquilateralTriangle(val side: Double) {
  fun area() = sqrt(3.0) / 4 * side * side
}