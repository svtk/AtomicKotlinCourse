package interfaces1

import atomictest.eq

data class Position(val x: Int, val y: Int)

interface GameMatrix {
  fun add(element: GameElement, position: Position)
  fun remove(element: GameElement, position: Position)
  fun elementsAt(position: Position): Set<GameElement>
}

class GameMatrixImpl(width: Int, height: Int) : GameMatrix {
  private val cells = List(height) {
    List(width) { mutableSetOf<GameElement>() }
  }

  private fun elements(position: Position) = cells[position.y][position.x]

  override fun add(element: GameElement, position: Position) {
    elements(position) += element
  }

  override fun remove(element: GameElement, position: Position) {
    elements(position) -= element
  }

  override fun elementsAt(position: Position): Set<GameElement> {
    // We create a fresh read-only copy of a set to avoid the situation
    // when someone iterates over the set and changes it at the same time
    // (which may lead to ConcurrentModificationException)
    return elements(position).toSet()
  }

  override fun toString() =
      cells.joinToString("\n") { row ->
        row.joinToString("") { elements ->
          // As we can't display several elements on the one cell
          // as one character, for simplicity
          // we display only the last one
          "${elements.lastOrNull()?.symbol ?: ' '}"
        }.trimEnd()
      }
}

fun main() {
  val matrix = GameMatrixImpl(width = 4, height = 5)
  matrix.add(Robot(), Position(x = 1, y = 2))
  matrix.add(Food(), Position(x = 2, y = 3))
  for (y in 0..4) {
    matrix.add(Wall(), Position(0, y))
    matrix.add(Wall(), Position(3, y))
  }
  for (x in 1..2) {
    matrix.add(Wall(), Position(x, 0))
    matrix.add(Wall(), Position(x, 4))
  }
  matrix.toString() eq
      """
      ####
      #  #
      #R #
      # .#
      ####
      """.trimIndent()
  matrix.elementsAt(Position(1, 2)).singleOrNull()?.symbol eq 'R'
}