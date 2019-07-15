package inheritance1

interface GameElement {
    val symbol: Char
    fun interact(maze: Maze, sameCellElements: Set<GameElement>)
}

open class ImmovableElement : GameElement {
    override fun interact(maze: Maze, sameCellElements: Set<GameElement>) {
        // Default implementation: do nothing
    }

    override val symbol: Char get() = ' '
}

class Wall : ImmovableElement() {
    override val symbol get() = '#'
}

class Food : ImmovableElement() {
    override val symbol get() = '.'
}

fun createGameElement(char: Char?): GameElement? = when (char) {
    '#' -> Wall()
    '.' -> Food()
    else -> null
}