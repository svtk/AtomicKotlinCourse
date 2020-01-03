package inheritanceExercise4

interface GameElement {
  val symbol: Char
  fun play(maze: Maze)
}

open class StaticElement : GameElement {
  override fun play(maze: Maze) {
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
}

fun createGameElement(char: Char?): GameElement? = when (char) {
  '#' -> Wall()
  '.' -> Food()
  'R' -> Robot()
  in '0'..'9' -> Bomb(char!! - '0')
  else -> null
}