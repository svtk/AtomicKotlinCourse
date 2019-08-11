package creatingClasses3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertEqualsForOutput
import util.TIMEOUT
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.AssertionError

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSimpleStringPalindrome {

  @Test(timeout = TIMEOUT)
  fun testRobot() {
    createRobotInstance()
  }

  fun testDirection(direction: String, steps: Int) {
    val (robotClass, robot) = createRobotInstance()

    val goMethod =
        try {
          robotClass.getMethod("go$direction", Int::class.java)
        } catch (e: NoSuchMethodException) {
          throw AssertionError("Can't find the 'go$direction(steps: Int)' member function in 'Robot' class")
        }

    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    goMethod.invoke(robot, steps)
    assertEqualsForOutput("Incorrect output for 'go$direction' method",
        "going ${direction.decapitalize()} $steps steps",
        byteArrayOutputStream)
  }

  private fun createRobotInstance(): Pair<Class<out Any>, Any> {
    val robotClass =
        try {
          ClassLoader.getSystemClassLoader().loadClass("creatingClasses1.Robot")
        } catch (e: ClassNotFoundException) {
          throw AssertionError("Can't find the 'Robot' class in 'creatingClasses1' package")
        }
    val robot = robotClass.constructors.first().newInstance()
    return Pair(robotClass, robot)
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
