package inheritance2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBomb {
    private fun checkMaze(
            bombPosition: Position,
            mazeRepresentation: String,
            afterDestroy: String,
            prefixMessage: String? = null
    ) {
        val maze = MazeImpl(mazeRepresentation)
        val robot = Robot()
        maze.add(robot, bombPosition)
        val bomb = maze.allAt(bombPosition)
                .filterIsInstance<Bomb>().single()
        bomb.interact(maze, setOf(robot))

        Assert.assertEquals("${prefixMessage ?: ""} " +
                "Wrong result after exploding a bomb for the following maze:\n$mazeRepresentation",
                afterDestroy,
                maze.toString())
    }

    @Test
    fun test1Sample() = checkMaze(Position(5, 4),
            """
        ###########
        #.........#
        #.........#
        #.........#
        #....4....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent(),
            """
        ###########
        #.........#
        #.... ....#
        #...   ...#
        #..     ..#
        #...   ...#
        #.... ....#
        #.........#
        ###########
        """.trimIndent()
    )

    @Test
    fun test2() = checkMaze(Position(5, 4),
            """
        ###########
        #.........#
        #.........#
        #.........#
        #....1....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent(),
            """
        ###########
        #.........#
        #.........#
        #.........#
        #.... ....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent()
    )

    @Test
    fun test3() = checkMaze(Position(5, 4),
            """
        ###########
        #.........#
        #.........#
        #.........#
        #....2....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent(),
            """
        ###########
        #.........#
        #.........#
        #.... ....#
        #...   ...#
        #.... ....#
        #.........#
        #.........#
        ###########
        """.trimIndent()
    )

    @Test
    fun test4() = checkMaze(Position(5, 4),
            """
        ###########
        #.........#
        #.........#
        #.........#
        #....3....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent(),
            """
        ###########
        #.........#
        #.........#
        #...   ...#
        #...   ...#
        #...   ...#
        #.........#
        #.........#
        ###########
        """.trimIndent()
    )

    @Test
    fun test5() = checkMaze(Position(5, 4),
            """
        ###########
        #.........#
        #.........#
        #.........#
        #....5....#
        #.........#
        #.........#
        #.........#
        ###########
        """.trimIndent(),
            """
        ###########
        #.........#
        #...   ...#
        #..     ..#
        #..     ..#
        #..     ..#
        #...   ...#
        #.........#
        ###########
        """.trimIndent()
    )

    // TODO: Should or shouldn't?..
/*
    @Test
    fun test6() = checkMaze(Position(2, 2),
            """
        #####
        #####
        # 3##
        #####
        #####
        """.trimIndent(),
            """
        #####
        #####
        #  ##
        #####
        #####
        """.trimIndent(),
            "Walls shouldn't be exploded."
    )*/
}