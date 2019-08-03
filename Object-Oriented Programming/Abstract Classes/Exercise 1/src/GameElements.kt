package abstractClasses1

interface GameElement {
    val symbol: Char
    val sharesCell: Boolean

    fun interact(maze: Maze, sameCellElements: Set<GameElement>)
}

open class ImmovableElement(
        override val symbol: Char,
        override val sharesCell: Boolean
) : GameElement {
    override fun interact(maze: Maze, sameCellElements: Set<GameElement>) {
        // Default implementation: do nothing
    }

    override fun toString() = symbol.toString()
}

class Wall : ImmovableElement('#', sharesCell = false)

class Food : ImmovableElement('.', sharesCell = true)

fun createGameElement(char: Char?): GameElement? = when (char) {
    '#' -> Wall()
    '.' -> Food()
    'M' -> Monster()
    else -> null
}