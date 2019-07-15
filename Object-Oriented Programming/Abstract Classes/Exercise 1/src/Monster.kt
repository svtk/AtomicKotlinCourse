package abstractClasses1

import abstractClasses1.Move.*
import atomictest.eq

private fun Move.adjustDirection(direction: Move): Move {
    return when ((this.ordinal + direction.ordinal) % 4) {
        0 -> UP
        1 -> RIGHT
        2 -> DOWN
        else -> LEFT
    }
}

class Monster : MovableElement() {

    private var lastMove = Move.UP

    override val symbol: Char get() = 'M'

    override fun interact(maze: Maze, sameCellElements: Set<GameElement>) {
        // later: eat Robot
    }

    override fun makeMove(currentPosition: Position, maze: Maze): Position {
        val directions = listOf(RIGHT, UP, LEFT, DOWN)
        directions.forEach { direction ->
            val newMove = lastMove.adjustDirection(direction)
            val newPosition = currentPosition.applyMove(newMove)
            if (maze.isPassable(newPosition)) {
                lastMove = newMove
                return newPosition
            }
        }
        return currentPosition
    }
}

fun main(args: Array<String>) {
    val mapRepresentation = """
         #######
        ##     #
        #   ####
        #   #
        #####
        """.trimIndent()
    val maze = MazeImpl(mapRepresentation)
    maze.toString() eq mapRepresentation

    val monster =  Monster()
    var currentMonsterPosition = Position(x = 1, y = 3)
    maze.add(monster, currentMonsterPosition)
    maze.toString() eq """
         #######
        ##     #
        #   ####
        #M  #
        #####
        """.trimIndent()


    // after 1 move
    currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
    maze.move(monster, currentMonsterPosition)
    maze.toString() eq """
         #######
        ##     #
        #   ####
        # M #
        #####
        """.trimIndent()

    // after 2 more moves
    repeat(2) {
        currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
        maze.move(monster, currentMonsterPosition)
    }
    maze.toString() eq """
         #######
        ##     #
        #  M####
        #   #
        #####
        """.trimIndent()

    // after 5 more moves
    repeat(5) {
        currentMonsterPosition = monster.makeMove(currentMonsterPosition, maze)
        maze.move(monster, currentMonsterPosition)
    }
    maze.toString() eq """
         #######
        ##   M #
        #   ####
        #   #
        #####
        """.trimIndent()
}