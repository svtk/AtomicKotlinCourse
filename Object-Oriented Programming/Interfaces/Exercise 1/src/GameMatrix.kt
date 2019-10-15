package interfaces.exercise1

import atomictest.eq

data class Position(val x: Int, val y: Int)

interface Maze {
  val width: Int
  val height: Int
  fun all(): Set<GameElement>
  fun allAt(position: Position): Set<GameElement>
  fun position(element: GameElement): Position?
  fun add(element: GameElement, position: Position)
  fun remove(element: GameElement)
}

class MazeImpl(
    override val width: Int,
    override val height: Int
) : Maze {
  private val cells = List(height) {
    List(width) { mutableSetOf<GameElement>() }
  }
  private val positions = mutableMapOf<GameElement, Position>()

  private fun elements(position: Position): MutableSet<GameElement> {
    return cells[position.y][position.x]
  }

  override fun all(): Set<GameElement> {
    return positions.keys.toSet()
  }

  override fun allAt(position: Position): Set<GameElement> {
    return elements(position)
  }

  override fun position(element: GameElement): Position? {
    return positions[element]
  }

  override fun add(element: GameElement, position: Position) {
    elements(position) += element
    positions[element] = position
  }

  override fun remove(element: GameElement) {
    val position = position(element) ?: return
    elements(position) -= element
    positions.remove(element)
  }

  override fun toString() =
      cells.joinToString("\n") { row ->
        row.joinToString("") { elements ->
          // As we can't display several elements on the one cell
          // as one character, for simplicity
          // we display only the last element
          "${elements.lastOrNull()?.symbol ?: ' '}"
        }.trimEnd()
      }
}

fun main() {
  val maze = MazeImpl(width = 4, height = 5)
  maze.add(Robot(), Position(x = 1, y = 2))

  val food = Food()
  maze.add(food, Position(x = 2, y = 3))
  for (y in 0..4) {
    maze.add(Wall(), Position(0, y))
    maze.add(Wall(), Position(3, y))
  }
  for (x in 1..2) {
    maze.add(Wall(), Position(x, 0))
    maze.add(Wall(), Position(x, 4))
  }
  maze.toString() eq
      """
      ####
      #  #
      #R #
      # .#
      ####
      """.trimIndent()
  maze.allAt(Position(1, 2)).singleOrNull()?.symbol eq 'R'
  maze.allAt(Position(2, 3)).singleOrNull()?.symbol eq '.'

  maze.remove(food)
  maze.allAt(Position(2, 3)) eq emptySet()
}