package complexConstructorsExercise1

import atomictest.eq

data class Cell(val x: Int, val y: Int)

interface Maze {
  val width: Int
  val height: Int
  fun all(): Set<GameElement>
  fun allIn(cell: Cell): Set<GameElement>
  fun cell(element: GameElement): Cell?
  fun add(element: GameElement, cell: Cell)
  fun remove(element: GameElement)
}

class MazeImpl(
  representation: String
) : Maze {
  override val width: Int
  override val height: Int

  private val elementMap: List<List<MutableSet<GameElement>>>
  private val cellMap = mutableMapOf<GameElement, Cell>()

  init {
    val lines = representation.lines()
    height = lines.size
    width = lines.maxBy { it.length }?.length ?: 0
    elementMap = List(height) {
      List(width) { mutableSetOf<GameElement>() }
    }
    for (y in 0 until height) {
      for (x in 0 until width) {
        val ch = lines.getOrNull(y)?.getOrNull(x)
        val element = createGameElement(ch)
        if (element != null) {
          add(element, Cell(x, y))
        }
      }
    }
  }

  private fun elements(cell: Cell): MutableSet<GameElement> {
    return elementMap[cell.y][cell.x]
  }

  override fun all(): Set<GameElement> {
    return cellMap.keys.toSet()
  }

  override fun allIn(cell: Cell): Set<GameElement> {
    return elements(cell)
  }

  override fun cell(element: GameElement): Cell? {
    return cellMap[element]
  }

  override fun add(element: GameElement, cell: Cell) {
    elements(cell) += element
    cellMap[element] = cell
  }

  override fun remove(element: GameElement) {
    val cell = cell(element) ?: return
    elements(cell) -= element
    cellMap.remove(element)
  }

  override fun toString() =
    elementMap.joinToString("\n") { row ->
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