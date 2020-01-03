package inheritanceExercise4

import atomictest.eq
import kotlin.math.pow
import kotlin.math.sqrt

class Bomb(
  private val diameter: Int
) : StaticElement() {
  override val symbol get() = '0' + diameter

  override fun play(maze: Maze) {
    val bombCell = maze.cell(this) ?: return
    maze.all().forEach { element ->
      val cell = maze.cell(element)
      if (cell != null &&
        isCloseToBomb(cell, bombCell)) {
        maze.remove(element)
      }
    }
  }

  private fun isCloseToBomb(cell: Cell, bombCell: Cell) =
    2 * distance(cell, bombCell) < diameter + 0.0000001

  private fun distance(from: Cell, to: Cell): Double {
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

  val bombCell = Cell(x = 5, y = 4)
  // Adding a robot to the 'bomb' cell should trigger the bomb
  val robot = Robot()
  maze.add(robot, bombCell)

  val bomb = maze.allIn(bombCell)
    .filterIsInstance<Bomb>().single()
  bomb.play(maze)

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