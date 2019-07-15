package interfaces1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPersonsMap {
    @Test
    fun test1Sample() {
        val matrix = GameMatrixImpl(width = 4, height = 5)
        matrix.add(Robot(), Position(x = 1, y = 2))
        matrix.add(Food(), Position(x = 2, y = 3))
        for (i in 0..4) {
            matrix.add(Wall(), Position(0, i))
            matrix.add(Wall(), Position(3, i))
        }
        for (i in 1..2) {
            matrix.add(Wall(), Position(i, 0))
            matrix.add(Wall(), Position(i, 4))
        }
        Assert.assertEquals("Wrong result for the sample:",
                """
                ####
                #  #
                #R #
                # .#
                ####
            """.trimIndent(),
                matrix.toString())
        Assert.assertEquals("Wrong result for the sample. At Position(1, 2) should be Robot",
                'R', matrix.elementsAt(Position(1, 2)).singleOrNull()?.symbol)
    }

    private fun createGameElement(char: Char): GameElement? = when (char) {
        '#' -> Wall()
        '.' -> Food()
        'R' -> Robot()
        else -> null
    }

    private fun checkMaze(maze: String) {
        val lines = maze.lines().filter { it.isNotEmpty() }
        val height = lines.size
        val lengths = lines.map { it.length }
        val width = lengths.first()

        val matrix = GameMatrixImpl(width, height)
        for (y in 0 until height) {
            for (x in 0 until width) {
                val ch = lines[y][x]
                val element = createGameElement(ch)
                if (element != null) {
                    matrix.add(element, Position(x, y))
                }
            }
        }
        Assert.assertEquals("Wrong result for the maze:",
                maze,
                matrix.toString())
    }

    @Test
    fun test2() = checkMaze("""
            ####
            ####
            ####
        """.trimIndent())

    @Test
    fun test3() = checkMaze("""
            ####
            #R.#
            ####
        """.trimIndent())

    @Test
    fun test4() = checkMaze("""
            . ##
               #
            #  R
        """.trimIndent())

    @Test
    fun test5() = checkMaze("""
            ....
            ....
            ...R
        """.trimIndent())
}