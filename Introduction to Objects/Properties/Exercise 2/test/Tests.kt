package propertiesExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPropertiesExercise2 {
  class RobotHandler {
    val robot: Robot = Robot()
    val loggedMovements = StringBuilder()

    fun goRight(steps: Int) {
      robot.right(steps)
      loggedMovements.appendln("right($steps)")
    }

    fun goLeft(steps: Int) {
      robot.left(steps)
      loggedMovements.appendln("left($steps)")

    }

    fun goDown(steps: Int) {
      robot.down(steps)
      loggedMovements.appendln("down($steps)")

    }

    fun goUp(steps: Int) {
      robot.up(steps)
      loggedMovements.appendln("up($steps)")
    }
  }

  private fun testMovements(location: String, movements: RobotHandler.() -> Unit) {
    val robotHandler = RobotHandler()
    robotHandler.movements()
    val actualLocation = robotHandler.robot.getLocation()
    val message = if (robotHandler.loggedMovements.isEmpty()) {
      "Initial location of the robot should be (0, 0)"
    } else {
      "Wrong location after:\n" + robotHandler.loggedMovements
    }
    Assert.assertEquals(message, location, actualLocation)
  }

  @Test(timeout = TIMEOUT)
  fun test1Initial() = testMovements("(0, 0)") {}

  @Test(timeout = TIMEOUT)
  fun test2Right() = testMovements("(1, 0)") {
    goRight(1)
  }

  @Test(timeout = TIMEOUT)
  fun test3Left() = testMovements("(1, 0)") {
    goRight(2)
    goLeft(1)
  }

  @Test(timeout = TIMEOUT)
  fun test4Down() = testMovements("(0, 1)") {
    goDown(1)
  }

  @Test(timeout = TIMEOUT)
  fun test5Up() = testMovements("(0, 1)") {
    goDown(2)
    goUp(1)
  }

  @Test(timeout = TIMEOUT)
  fun test6SeveralSteps() = testMovements("(3, 5)") {
    goRight(3)
    goDown(5)
  }

  @Test(timeout = TIMEOUT)
  fun test7SeveralSteps2() = testMovements("(10, 10)") {
    goRight(13)
    goDown(15)
    goUp(5)
    goLeft(3)
  }
}