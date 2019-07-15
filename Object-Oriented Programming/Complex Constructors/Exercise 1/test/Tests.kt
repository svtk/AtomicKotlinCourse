package complexConstructors1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPersonsMap {
    @Test
    fun test1Sample() {
        val mazeRepresentation = """
                 ###
                #
                #R #

                ####
            """.trimIndent()

        val matrix = GameMatrixImpl(
                width = 4, height = 5, representation = mazeRepresentation)
        Assert.assertEquals("Wrong result for the sample:", mazeRepresentation,
                matrix.toString().lines().joinToString("\n") { it.trimEnd() })
    }

    private fun checkMaze(width: Int, height: Int, maze: String) {
        val matrix = GameMatrixImpl(width, height, maze)
        Assert.assertEquals("Wrong result for the maze:", maze,
                matrix.toString().lines().joinToString("\n") { it.trimEnd() })
    }

    @Test
    fun test2() = checkMaze(4, 3, """

            #

        """.trimIndent())

    @Test
    fun test3() = checkMaze(4, 3, """
            ####
            #R.
              ##
        """.trimIndent())

    @Test
    fun test4() = checkMaze(4, 3, """
            . ##

            #  R
        """.trimIndent())

    @Test
    fun test5() = checkMaze(5, 5, """
            .
            R

            ##
            .#
        """.trimIndent())
}