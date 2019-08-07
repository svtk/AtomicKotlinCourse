package abstractClasses1

import abstractClasses1.Move.*
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRobotMoves {
  private fun checkMove(
      move: Move,
      initial: String,
      expected: String
  ) {
    val maze = MazeImpl(initial.trimIndent())
    val robot = maze.all().filterIsInstance<Robot>().single()
    val position = robot.makeMove(move, maze)
    if (position != null) {
      maze.remove(robot)
      maze.add(robot, position)
    }
    Assert.assertEquals(
        "Wrong result for\n$initial",
        expected.trimIndent(),
        maze.toString()
    )
  }

  @Test(timeout = TIMEOUT)
  fun testRight() {
    checkMove(
        RIGHT,
        initial = """
            #####
            #   #
            # R #
            #   #
            #####""",
        expected = """
            #####
            #   #
            #  R#
            #   #
            #####""")
  }

  @Test(timeout = TIMEOUT)
  fun testLeft() {
    checkMove(
        LEFT,
        initial = """
            #####
            #   #
            # R #
            #   #
            #####""",
        expected = """
            #####
            #   #
            #R  #
            #   #
            #####""")
  }

  @Test(timeout = TIMEOUT)
  fun testUp() {
    checkMove(
        UP,
        initial = """
            #####
            #   #
            # R #
            #   #
            #####""",
        expected = """
            #####
            # R #
            #   #
            #   #
            #####""")
  }

  @Test(timeout = TIMEOUT)
  fun testDown() {
    checkMove(
        DOWN,
        initial = """
            #####
            #   #
            # R #
            #   #
            #####""",
        expected = """
            #####
            #   #
            #   #
            # R #
            #####""")
  }

  @Test(timeout = TIMEOUT)
  fun testImpossibleMoves() {
    Move.values().forEach {
      checkMove(
          it,
          initial = """
            ###
            #R#
            ###""",
          expected = """
            ###
            #R#
            ###""")
    }
  }
}