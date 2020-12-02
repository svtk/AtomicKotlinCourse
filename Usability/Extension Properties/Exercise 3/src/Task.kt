// ExtensionProperties/Task3.kt
package extensionPropertiesExercise3

import atomictest.eq

class Rectangle(val width: Int, val height: Int)

val Rectangle.isSquare
  get() = width == height

fun main() {
/*
  val rectangle = Rectangle(1, 2)
  rectangle.isSquare eq false

  val square = Rectangle(3, 3)
  square.isSquare eq true
*/
}