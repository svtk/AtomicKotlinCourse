package inheritance1

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
                    "${elements.lastOrNull()?.symbol ?: ' '}"
                }.trimEnd()
            }
}