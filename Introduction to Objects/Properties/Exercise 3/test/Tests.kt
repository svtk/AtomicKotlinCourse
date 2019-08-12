package properties3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRobotTeleportation {
  class RobotHandler {
    val robot: Robot = Robot()
    val loggedMovements = StringBuilder()

    fun goRight(steps: Int) {
      robot.goRight(steps)
      loggedMovements.appendln("goRight($steps)")
    }

    fun goLeft(steps: Int) {
      robot.goLeft(steps)
      loggedMovements.appendln("goLeft($steps)")

    }

    fun goDown(steps: Int) {
      robot.goDown(steps)
      loggedMovements.appendln("goDown($steps)")

    }

    fun goUp(steps: Int) {
      robot.goUp(steps)
      loggedMovements.appendln("goUp($steps)")
    }
  }

  private fun testMovements(location: String, movements: RobotHandler.() -> Unit) {
    val robotHandler = RobotHandler()
    robotHandler.movements()
    val actualLocation = robotHandler.robot.getLocation()
    val message = if (robotHandler.loggedMovements.isEmpty()) {
      "Initial location of the robot should be (0,0)"
    } else {
      "Wrong location after:\n" + robotHandler.loggedMovements
    }
    Assert.assertEquals(message, location, actualLocation)
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = testMovements("(90, 99)") {
    goUp(1)
    goLeft(10)
  }

  @Test(timeout = TIMEOUT)
  fun test2Left() = testMovements("(70, 0)") {
    goLeft(30)
  }

  @Test(timeout = TIMEOUT)
  fun test3Up() = testMovements("(0, 99)") {
    goUp(1)
  }

  @Test(timeout = TIMEOUT)
  fun test4Left() = testMovements("(70, 0)") {
    goLeft(130)
  }

  @Test(timeout = TIMEOUT)
  fun test5Up() = testMovements("(0, 99)") {
    goUp(101)
  }

  @Test(timeout = TIMEOUT)
  fun test6Right() = testMovements("(10, 0)") {
    goRight(110)
  }

  @Test(timeout = TIMEOUT)
  fun test7Down() = testMovements("(0, 20)") {
    goDown(120)
  }

  @Test(timeout = TIMEOUT)
  fun test8SeveralSteps() = testMovements("(10, 10)") {
    goRight(313)
    goDown(415)
    goUp(505)
    goLeft(703)
  }
}
