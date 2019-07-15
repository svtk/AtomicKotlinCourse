package inheritance2

interface GameElement {
    val symbol: Char
    fun interact(maze: Maze, sameCellElements: Set<GameElement>)
}

open class ImmovableElement : GameElement {
    override fun interact(maze: Maze, sameCellElements: Set<GameElement>) {
        // Default implementation: do nothing
    }

    override val symbol: Char
        get() = ' '
}

class Wall : ImmovableElement() {
    override val symbol get() = '#'
}

class Food : ImmovableElement() {
    override val symbol get() = '.'
}

class Robot : GameElement {
    private var eatenFoodItems: Int = 0

    override val symbol: Char
        get() = 'R'

    override fun interact(
            maze: Maze,
            sameCellElements: Set<GameElement>
    ) {
        sameCellElements
                .filterIsInstance<Food>()
                .forEach { food ->
                    eatenFoodItems++
                    maze.destroy(food)
                }
    }
}

fun createGameElement(char: Char?): GameElement? = when (char) {
    '#' -> Wall()
    '.' -> Food()
    'R' -> Robot()
    in '0'..'9' -> Bomb(char!! - '0')
    else -> null
}