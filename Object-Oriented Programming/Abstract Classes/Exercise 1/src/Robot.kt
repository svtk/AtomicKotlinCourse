package abstractClassesExercise1

import atomictest.eq

class Robot : MobileElement() {

  private var eatenFoodItems: Int = 0

  override val symbol: Char
    get() = 'R'

  override fun play(maze: Maze) {
    val position = maze.position(this) ?: return
    val cellElements = maze.allAt(position)
    cellElements
      .filterIsInstance<Food>()
      .forEach { food ->
        eatenFoodItems++
        maze.remove(food)
      }
  }

  override fun move(move: Move, maze: Maze): Position? {
    val currentPosition = maze.position(this) ?: return null
    val newPosition = currentPosition.applyMove(move)
    if (!maze.isPassable(newPosition)) return null
    return newPosition
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

  fun updateRobotPosition(position: Position?) {
    if (position != null) {
      maze.remove(robot)
      maze.add(robot, position)
    }
  }

  updateRobotPosition(Position(x = 2, y = 1))
  maze.toString() eq """
        #####
        # R #
        #  ##
        """.trimIndent()


  updateRobotPosition(robot.move(Move.DOWN, maze))
  maze.toString() eq """
        #####
        #   #
        # R##
        """.trimIndent()

  // The right move is impossible:
  val position = robot.move(Move.RIGHT, maze)
  position eq null
}