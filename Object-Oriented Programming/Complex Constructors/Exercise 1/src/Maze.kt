package complexConstructors1

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
    representation: String
) : Maze {
  override val width: Int
  override val height: Int

  private val cells: List<List<MutableSet<GameElement>>>
  private val positions = mutableMapOf<GameElement, Position>()

  init {
    val lines = representation.lines()
    height = lines.size
    width = lines.maxBy { it.length }?.length ?: 0
    cells = List(height) {
      List(width) { mutableSetOf<GameElement>() }
    }
    for (y in 0 until height) {
      for (x in 0 until width) {
        val ch = lines.getOrNull(y)?.getOrNull(x)
        val element = createGameElement(ch)
        if (element != null) {
          add(element, Position(x, y))
        }
      }
    }
  }

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
          "${elements.lastOrNull()?.symbol ?: ' '}"
        }.trimEnd()
      }
}

fun main() {
  val mazeRepresentation = """
     ###
    #
    #R #

    ####
    """.trimIndent()
  val matrix = MazeImpl(mazeRepresentation)
  // trim whitespaces at the end of each line
  // to have equal representation
  matrix
      .toString().lines()
      .joinToString("\n") { it.trimEnd() } eq
      mazeRepresentation
}