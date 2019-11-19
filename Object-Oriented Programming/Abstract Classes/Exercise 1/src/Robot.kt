package abstractClassesExercise1

import atomictest.eq

class Robot : MobileElement() {

  private var eatenFoodItems: Int = 0

  override val symbol: Char
    get() = 'R'

  override fun play(maze: Maze) {
    val cell = maze.cell(this) ?: return
    val cellElements = maze.allIn(cell)
    cellElements
      .filterIsInstance<Food>()
      .forEach { food ->
        eatenFoodItems++
        maze.remove(food)
      }
  }

  override fun move(move: Move, maze: Maze): Cell? {
    val currentCell = maze.cell(this) ?: return null
    val newCell = currentCell.applyMove(move)
    if (!maze.isPassable(newCell)) return null
    return newCell
  }
}

fun main() {
  val mapRepresentation = """
        #####
        #   #
        #  ##
        """.trimIndent()
  val maze = MazeImpl(mapRepresentation)
  maze.toString() eq mapRepresentation

  val robot = Robot()

  fun updateRobotCell(cell: Cell?) {
    if (cell != null) {
      maze.remove(robot)
      maze.add(robot, cell)
    }
  }

  updateRobotCell(Cell(x = 2, y = 1))
  maze.toString() eq """
        #####
        # R #
        #  ##
        """.trimIndent()


  updateRobotCell(robot.move(Move.DOWN, maze))
  maze.toString() eq """
        #####
        #   #
        # R##
        """.trimIndent()

  // The right move is impossible:
  val cell = robot.move(Move.RIGHT, maze)
  cell eq null
}