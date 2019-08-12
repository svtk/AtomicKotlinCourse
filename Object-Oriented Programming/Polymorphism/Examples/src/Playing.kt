// Polymorphism/Playing.kt
package polymorphism 
import upcasting.*

fun play(gameElement: GameElement) {
  println("Playing turn:")
  gameElement.playTurn()
}

fun moveAround(mobileElement: MobileElement) {
  println("Moving around:")
  mobileElement.makeMove(Move.RIGHT)
  mobileElement.makeMove(Move.RIGHT)
  mobileElement.makeMove(Move.UP)
}

fun checkScore(robot: Robot) {
  println("The score is:")
  println(robot.score())
}

fun main() {
  val robot = Robot()
  val wall = Wall() 
  val bomb = Bomb()
  play(robot)
  play(wall)
  play(bomb)
  moveAround(robot)
  checkScore(robot)
}
/* Output:
Playing turn:
Robot eats some food
Playing turn:
Static element does nothing
Playing turn:
Bomb blows up some elements
Moving around:
Robot goes RIGHT
Robot goes RIGHT
Robot goes UP
The score is:
the amount of eaten food
*/