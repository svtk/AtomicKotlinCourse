package complexConstructors.exercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMazeImpl {
  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    val mazeRepresentation = """
                 ###
                #
                #R #

                ####
            """.trimIndent()

    val matrix = MazeImpl(mazeRepresentation)
    Assert.assertEquals("Wrong result for the sample:", mazeRepresentation,
        matrix.toString().lines().joinToString("\n") { it.trimEnd() })
  }

  private fun checkMaze(width: Int, height: Int, maze: String) {
    val matrix = MazeImpl(maze)
    Assert.assertEquals("Wrong result for the maze:", maze,
        matrix.toString().lines().joinToString("\n") { it.trimEnd() })
  }

  @Test(timeout = TIMEOUT)
  fun test2() = checkMaze(4, 3, """

            #

        """.trimIndent())

  @Test(timeout = TIMEOUT)
  fun test3() = checkMaze(4, 3, """
            ####
            #R.
              ##
        """.trimIndent())

  @Test(timeout = TIMEOUT)
  fun test4() = checkMaze(4, 3, """
            . ##

            #  R
        """.trimIndent())

  @Test(timeout = TIMEOUT)
  fun test5() = checkMaze(5, 5, """
            .
            R

            ##
            .#
        """.trimIndent())
}