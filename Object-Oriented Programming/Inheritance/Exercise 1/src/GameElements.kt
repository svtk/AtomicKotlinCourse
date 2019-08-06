package inheritance2

interface GameElement {
  val symbol: Char
  fun playTurn(maze: Maze)
}

open class StaticElement : GameElement {
  override fun playTurn(maze: Maze) {
    // Default implementation: do nothing
  }

  override val symbol: Char
    get() = ' '
}

class Wall : StaticElement() {
  override val symbol get() = '#'
}

class Food : StaticElement() {
  override val symbol get() = '.'
}

class Robot : GameElement {
  private var eatenFoodItems: Int = 0

  override val symbol: Char
    get() = 'R'

  override fun playTurn(maze: Maze) {
    val position = maze.position(this)
        ?: return
    val cellElements = maze.allAt(position)
    cellElements
        .filterIsInstance<Food>()
        .forEach { food ->
          eatenFoodItems++
          maze.remove(food)
        }
  }
}

fun createGameElement(char: Char?): GameElement? = when (char) {
  '#' -> Wall()
  '.' -> Food()
  'R' -> Robot()
  in '0'..'9' -> Bomb(char!! - '0')
  else -> null
}