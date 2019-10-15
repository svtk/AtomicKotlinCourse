package constrainingVisibility3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.checkSystemOutput
import util.runAndGetSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRobotIncorrectInput {
  class RobotHandler() {
    val robot: Robot = Robot(10, 0, 0)
    val loggedMovements = StringBuilder()
    var loggedSteps: Int? = null

    fun goRight(steps: Int) {
      robot.goRight(steps)
      loggedMovements.appendln("goRight($steps)")
      loggedSteps = steps
    }

    fun goLeft(steps: Int) {
      robot.goLeft(steps)
      loggedMovements.appendln("goLeft($steps)")
      loggedSteps = steps
    }

    fun goDown(steps: Int) {
      robot.goDown(steps)
      loggedMovements.appendln("goDown($steps)")
      loggedSteps = steps
    }

    fun goUp(steps: Int) {
      robot.goUp(steps)
      loggedMovements.appendln("goUp($steps)")
      loggedSteps = steps
    }
  }

  private fun getErrorMessageText(steps: Int?) =
      "Incorrect input: $steps, the number of steps should be positive."

  private fun testWrongArgumentOutput(movements: RobotHandler.() -> Unit) {
    val robotHandler = RobotHandler()

    val output = runAndGetSystemOutput {
      robotHandler.movements()
    }

    val steps = robotHandler.loggedSteps
    val message = "Incorrect output after:\n" + robotHandler.loggedMovements
    if (output.isEmpty()) {
      throw AssertionError(message + "\nThe message " +
          "\"${getErrorMessageText(steps)}\" should be printed to the console")
    }
    checkSystemOutput(message,
        getErrorMessageText(steps),
        output)
  }


  @Test(timeout = TIMEOUT)
  fun test1Right() = testWrongArgumentOutput {
    goRight(-5)
  }

  @Test(timeout = TIMEOUT)
  fun test2Left() = testWrongArgumentOutput {
    goLeft(0)
  }

  @Test(timeout = TIMEOUT)
  fun test3Up() = testWrongArgumentOutput {
    goUp(-10)
  }

  @Test(timeout = TIMEOUT)
  fun test4Down() = testWrongArgumentOutput {
    goDown(-50)
  }
}

fun Robot(vararg a: Any?): Robot = TODO()