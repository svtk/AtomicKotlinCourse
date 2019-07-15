package abstractClasses1

import abstractClasses1.Move.*

abstract class MovableElement : GameElement {

    override val preventMovement: Boolean get() = false

    abstract fun makeMove(currentPosition: Position, maze: Maze): Position

    override fun toString() = symbol.toString()
}

enum class Move {
    UP, RIGHT, DOWN, LEFT, WAIT
}

fun Position.applyMove(move: Move): Position =
        when (move) {
            WAIT -> Position(x, y)
            UP -> Position(x, y - 1)
            DOWN -> Position(x, y + 1)
            RIGHT -> Position(x + 1, y)
            LEFT -> Position(x - 1, y)
        }