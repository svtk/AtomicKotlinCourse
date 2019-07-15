package inheritance1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestGameMatrix {
    @Test
    fun test1Sample() {
        val representation = """
        #####
        #...#
        #   #
        #####
            """.trimIndent()
        val maze = MazeImpl(representation)

        Assert.assertEquals("Wrong result for the sample before destroying element:",
                representation, maze.toString())

        val element = maze.allAt(Position(x = 2, y = 1)).single()
        maze.destroy(element)

        Assert.assertEquals("Wrong result for the sample after destroying element:",
                """
        #####
        #. .#
        #   #
        #####
            """.trimIndent(), maze.toString())
    }

    private fun checkMaze(
            positionsToDestroy: List<Position>,
            mazeRepresentation: String,
            afterDestroy: String
    ) {
        val maze = MazeImpl(mazeRepresentation)
        positionsToDestroy
                .flatMap { maze.allAt(it) }
                .forEach { maze.destroy(it) }
        Assert.assertEquals("Wrong result for a maze $mazeRepresentation\n" +
                "after destroying elements at $positionsToDestroy:",
                afterDestroy,
                maze.toString())
    }

    @Test
    fun test2() = checkMaze(listOf(Position(1, 1)),
            """
                ....
                ....
                ....
            """.trimIndent(),
            """
                ....
                . ..
                ....
            """.trimIndent())

    @Test
    fun test3() = checkMaze(listOf(Position(1, 1), Position(1, 2), Position(2, 1), Position(2, 2)),
            """
                ....
                ....
                ....
            """.trimIndent(),
            """
                ....
                .  .
                .  .
            """.trimIndent())

    @Test
    fun test4() = checkMaze(listOf(Position(1, 1)),
            """
                ####
                #R #
                ####
            """.trimIndent(),
            """
                ####
                #  #
                ####
            """.trimIndent())
}