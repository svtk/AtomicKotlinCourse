package inheritanceExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInheritanceExercise1 {
  private fun checkMaze(
    bombCell: Cell,
    mazeRepresentation: String,
    afterDestroy: String,
    prefixMessage: String? = null
  ) {
    val maze = MazeImpl(mazeRepresentation)
    val robot = Robot()
    maze.add(robot, bombCell)
    val bomb = maze.allIn(bombCell)
      .filterIsInstance<Bomb>().single()
    bomb.play(maze)

    Assert.assertEquals("${prefixMessage ?: ""} " +
      "Wrong result after exploding a bomb for the following maze:\n$mazeRepresentation",
      afterDestroy,
      maze.toString())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkMaze(Cell(5, 4),
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

  @Test(timeout = TIMEOUT)
  fun test2() = checkMaze(Cell(5, 4),
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

  @Test(timeout = TIMEOUT)
  fun test3() = checkMaze(Cell(5, 4),
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

  @Test(timeout = TIMEOUT)
  fun test4() = checkMaze(Cell(5, 4),
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

  @Test(timeout = TIMEOUT)
  fun test5() = checkMaze(Cell(5, 4),
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

  @Test(timeout = TIMEOUT)
  fun test6() = checkMaze(Cell(2, 2),
    """
      #####
      #####
      # 3##
      #####
      #####
      """.trimIndent(),
    """
      #####
      #   #
      #   #
      #   #
      #####
      """.trimIndent(),
    "Walls should also be exploded"
  )
}