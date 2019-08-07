package abstractClasses1

interface GameElement {
  val symbol: Char
  val sharesCell: Boolean
  fun playTurn(maze: Maze)
}

abstract class StaticElement(
    override val sharesCell: Boolean
) : GameElement {
  override fun playTurn(maze: Maze) {
    // Default implementation: do nothing
  }
}

class Wall : StaticElement(sharesCell = false) {
  override val symbol get() = '#'
}

class Food : StaticElement(sharesCell = true) {
  override val symbol get() = '.'
}

abstract class MobileElement : GameElement {
  override val sharesCell: Boolean
    get() = true

  abstract fun makeMove(
      move: Move, maze: Maze): Position?

  override fun toString() = symbol.toString()
}

enum class Move {
  UP, RIGHT, DOWN, LEFT, WAIT
}

fun createGameElement(char: Char?): GameElement? = when (char) {
  '#' -> Wall()
  '.' -> Food()
  'R' -> Robot()
  else -> null
}