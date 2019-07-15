package baseClassInitialization1

import atomictest.eq

interface Maze

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
}

class Wall : ImmovableElement('#', preventMovement = true)

class Food : ImmovableElement('.', preventMovement = false)

fun main() {
    val wall = Wall()
    wall.symbol eq '#'
    wall.preventMovement eq true

    val food = Food()
    food.symbol eq '.'
    food.preventMovement eq false

    // Wall and Food should extend ImmovableElement
    val elements: List<Any> = listOf(wall, food)
    elements.forEach {
        (it is ImmovableElement) eq true
    }
}