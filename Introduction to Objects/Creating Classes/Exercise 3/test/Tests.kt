package creatingClasses.exercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput
import util.loadClass
import util.loadMemberFunction
import kotlin.reflect.full.createInstance

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSimpleStringPalindrome {

  @Test(timeout = TIMEOUT)
  fun testRobot() {
    val robotClass = loadClass("creatingClasses3", "Robot")
    robotClass.createInstance()
  }

  private fun testDirection(direction: String, steps: Int) {
    val robotClass = loadClass("creatingClasses3", "Robot")
    val robot = robotClass.createInstance()
    val goMethod = loadMemberFunction(robotClass, "go$direction")

    runAndCheckSystemOutput("Incorrect output for 'go$direction' method",
      "$direction $steps steps") {
      goMethod.call(robot, steps)
    }
  }

  @Test(timeout = TIMEOUT)
  fun testRight() = testDirection("Right", 11)

  @Test(timeout = TIMEOUT)
  fun testLeft() = testDirection("Left", 37)

  @Test(timeout = TIMEOUT)
  fun testUp() = testDirection("Up", 4)

  @Test(timeout = TIMEOUT)
  fun testDown() = testDirection("Down", 8)
}