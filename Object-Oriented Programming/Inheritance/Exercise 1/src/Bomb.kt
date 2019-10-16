package inheritanceExercise1

import atomictest.eq
import kotlin.math.pow
import kotlin.math.sqrt

class Bomb(
    private val diameter: Int
) : StaticElement() {
  override val symbol get() = '0' + diameter

  override fun playTurn(maze: Maze) {
    val bombPosition = maze.position(this) ?: return
    maze.all().forEach { element ->
      val position = maze.position(element)
      if (position != null &&
          isCloseToBomb(position, bombPosition)) {
        maze.remove(element)
      }
    }
  }

  private fun isCloseToBomb(position: Position, bombPosition: Position) =
      2 * distance(position, bombPosition) < diameter + 0.0000001

  private fun distance(from: Position, to: Position): Double {
    fun sqr(i: Int) = i.toDouble().pow(2)
    return sqrt(sqr(from.x - to.x) + sqr(from.y - to.y))
  }
}

fun main() {
  val representation = """
        ###########
        #.........#
        #.........#
        #.........#
        #....4....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent()
  val maze = MazeImpl(representation)
  maze.toString() eq representation

  val bombPosition = Position(x = 5, y = 4)
  // Adding a robot to the 'bomb' cell should trigger the bomb
  val robot = Robot()
  maze.add(robot, bombPosition)

  val bomb = maze.allAt(bombPosition)
      .filterIsInstance<Bomb>().single()
  bomb.playTurn(maze)

  maze.toString() eq """
        ###########
        #.........#
        #.... ....#
        #...   ...#
        #..     ..#
        #...   ...#
        #.... ....#
        #.........#
        ###########
        """.trimIndent()
}