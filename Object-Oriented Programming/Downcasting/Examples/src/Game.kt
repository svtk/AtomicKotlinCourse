// Downcasting/Game.kt
package downcasting

interface Move
interface Element
interface MovableElement : Element {
  fun makeMove(move: Move): Position
}
data class Position(val x: Int, val y: Int)
class Robot : MovableElement {
  private var eatenFoodItems = 0
  override fun makeMove(move: Move): Position {
    println("Robot moves $move")
    return Position(0, 0)
  }
  fun score(): Int {
    return eatenFoodItems
  }
}

interface Maze {
  fun all(): Set<Element>
}

interface MutableMaze : Maze

// Dummy implementation:
class MazeImpl: MutableMaze {
  override fun all(): Set<Element> {
    return setOf() 
  }
}

interface Game {
  val maze: Maze
  fun playMove(move: Move)
  fun score(): Int
  // other members
}

class GameImpl: Game {
  private var turns = 0
  override val maze: MutableMaze = MazeImpl()

  override fun score(): Int {
    val robot = maze.all()
      .find { it is Robot }               // [1]
      ?: return 0                         // [2]
    return (robot as Robot)               // [3]
      .score() * 100 - turns              // [4]
  }
 
  override fun playMove(move: Move) {
    turns++
    val movableElements = maze.all()
      .filterIsInstance<MovableElement>() // [5]
    movableElements.forEach {
      val position = it.makeMove(move)    // [6]
      // update element position
    } 
  }
}