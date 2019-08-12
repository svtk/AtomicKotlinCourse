package creatingClasses3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.assertEqualsForOutput
import util.loadClass
import util.loadMethod
import java.io.ByteArrayOutputStream
import java.io.PrintStream
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

    val goMethod = loadMethod(robotClass, "go$direction")
    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    goMethod.call(robot, steps)
    assertEqualsForOutput("Incorrect output for 'go$direction' method",
        "$direction $steps steps",
        byteArrayOutputStream)
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
