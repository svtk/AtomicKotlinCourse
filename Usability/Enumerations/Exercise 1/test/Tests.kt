package enumerationsExercise1

import enumerationsExercise1.Direction.*
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestEnumerationsExercise1 {
  class RobotHandler {
    val robot: Robot = Robot()
    val loggedMovements = StringBuilder()

    fun goRight(steps: Int) {
      robot.go(RIGHT, steps)
      loggedMovements.appendLine("goRight($steps)")
    }

    fun goLeft(steps: Int) {
      robot.go(LEFT, steps)
      loggedMovements.appendLine("goLeft($steps)")

    }

    fun goDown(steps: Int) {
      robot.go(DOWN, steps)
      loggedMovements.appendLine("goDown($steps)")

    }

    fun goUp(steps: Int) {
      robot.go(UP, steps)
      loggedMovements.appendLine("goUp($steps)")
    }
  }

  private fun testMovements(location: String, movements: RobotHandler.() -> Unit) {
    val robotHandler = RobotHandler()
    robotHandler.movements()
    val actualLocation = robotHandler.robot.location
    val message = if (robotHandler.loggedMovements.isEmpty()) {
      "Initial location of the robot should be (0, 0)"
    } else {
      "Wrong location after:\n" + robotHandler.loggedMovements
    }
    Assert.assertEquals(message, location, actualLocation)
  }

  @Test(timeout = TIMEOUT)
  fun testInitial() = testMovements("(0, 0)") {}

  @Test(timeout = TIMEOUT)
  fun testRight() = testMovements("(1, 0)") {
    goRight(1)
  }

  @Test(timeout = TIMEOUT)
  fun testLeft() = testMovements("(1, 0)") {
    goRight(2)
    goLeft(1)
  }

  @Test(timeout = TIMEOUT)
  fun testDown() = testMovements("(0, 1)") {
    goDown(1)
  }

  @Test(timeout = TIMEOUT)
  fun testUp() = testMovements("(0, 1)") {
    goDown(2)
    goUp(1)
  }

  @Test(timeout = TIMEOUT)
  fun testSeveralSteps() = testMovements("(3, 5)") {
    goRight(3)
    goDown(5)
  }

  @Test(timeout = TIMEOUT)
  fun testSeveralSteps2() = testMovements("(10, 10)") {
    goRight(13)
    goDown(15)
    goUp(5)
    goLeft(3)
  }
}