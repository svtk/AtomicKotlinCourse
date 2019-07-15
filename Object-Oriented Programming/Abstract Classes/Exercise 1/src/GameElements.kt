package abstractClasses1

interface GameElement {
    val symbol: Char
    val preventMovement: Boolean

    fun interact(maze: Maze, sameCellElements: Set<GameElement>)
}

open class ImmovableElement(
        override val symbol: Char,
        override val preventMovement: Boolean
) : GameElement {
    override fun interact(maze: Maze, sameCellElements: Set<GameElement>) {
        // Default implementation: do nothing
    }

    override fun toString() = symbol.toString()
}

class Wall : ImmovableElement('#', preventMovement = true)

class Food : ImmovableElement('.', preventMovement = false)

fun createGameElement(char: Char?): GameElement? = when (char) {
    '#' -> Wall()
    '.' -> Food()
    'M' -> Monster()
    else -> null
}