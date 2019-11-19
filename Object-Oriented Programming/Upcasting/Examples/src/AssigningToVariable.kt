// Upcasting/AssigningToVariable.kt
package upcasting

fun main() {
  val element: GameElement = Robot()
  // Doesnt' compile:
  // element.move(Move.RIGHT)
}