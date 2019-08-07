// Abstract/MobileElement.kt
package abstractclasses

enum class Move {
  UP, RIGHT, DOWN, LEFT, WAIT
}

abstract class MobileElement : GameElement {
  override val sharesCell: Boolean
    get() = true

  abstract fun makeMove(             // [1]
      move: Move, maze: Maze): Position?

  override fun toString() = symbol.toString()
}

class Robot: MobileElement() {
  override val symbol: Char get() = 'R'
  override fun playTurn(maze: Maze) {
    // Eat food
  }
  override fun makeMove(             // [2]
      move: Move, maze: Maze): Position? {
    // Return new position
    return null
  }
}