package interfacesExercise1

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
  override val width: Int,
  override val height: Int
) : Maze {
  private val elementMap = List(height) {
    List(width) { mutableSetOf<GameElement>() }
  }
  private val cellMap = mutableMapOf<GameElement, Cell>()

  private fun elementsIn(cell: Cell): MutableSet<GameElement> {
    return elementMap[cell.y][cell.x]
  }

  override fun all(): Set<GameElement> {
    return cellMap.keys.toSet()
  }

  override fun allIn(cell: Cell): Set<GameElement> {
    return elementsIn(cell)
  }

  override fun cell(element: GameElement): Cell? {
    return cellMap[element]
  }

  override fun add(element: GameElement, cell: Cell) {
    elementsIn(cell) += element
    cellMap[element] = cell
  }

  override fun remove(element: GameElement) {
    val cell = cell(element) ?: return
    elementsIn(cell) -= element
    cellMap.remove(element)
  }

  override fun toString() =
    elementMap.joinToString("\n") { row ->
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
  maze.add(Robot(), Cell(x = 1, y = 2))

  val food = Food()
  maze.add(food, Cell(x = 2, y = 3))
  for (y in 0..4) {
    maze.add(Wall(), Cell(0, y))
    maze.add(Wall(), Cell(3, y))
  }
  for (x in 1..2) {
    maze.add(Wall(), Cell(x, 0))
    maze.add(Wall(), Cell(x, 4))
  }
  maze.toString() eq
    """
      ####
      #  #
      #R #
      # .#
      ####
      """.trimIndent()
  maze.allIn(Cell(1, 2)).singleOrNull()?.symbol eq 'R'
  maze.allIn(Cell(2, 3)).singleOrNull()?.symbol eq '.'

  maze.remove(food)
  maze.allIn(Cell(2, 3)) eq emptySet()
}