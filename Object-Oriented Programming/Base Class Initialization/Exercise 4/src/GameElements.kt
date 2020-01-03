package baseClassInitializationExercise4

import atomictest.eq

interface Maze

interface GameElement {
  val symbol: Char
  val sharesCell: Boolean

  fun play(maze: Maze)
}

open class StaticElement(
  override val symbol: Char,
  override val sharesCell: Boolean
) : GameElement {
  override fun play(maze: Maze) {
    // Default implementation: do nothing
  }
}

class Wall : StaticElement('#', sharesCell = false)

class Food : StaticElement('.', sharesCell = true)

fun main() {
  val wall = Wall()
  wall.symbol eq '#'
  wall.sharesCell eq false

  val food = Food()
  food.symbol eq '.'
  food.sharesCell eq true

  // Wall and Food should extend StaticElement
  val elements: List<Any> = listOf(wall, food)
  elements.forEach {
    (it is StaticElement) eq true
  }
}