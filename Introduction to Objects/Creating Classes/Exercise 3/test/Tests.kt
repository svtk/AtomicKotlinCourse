package creatingClassesExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput
import util.loadClass
import util.loadMemberFunction
import kotlin.reflect.full.createInstance

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCreatingRobot {

  @Test(timeout = TIMEOUT)
  fun testRobot() {
    val robotClass = loadClass("creatingClassesExercise3", "Robot")
    robotClass.createInstance()
  }

  private fun testDirection(direction: String, steps: Int) {
    val robotClass = loadClass("creatingClassesExercise3", "Robot")
    val robot = robotClass.createInstance()
    val goMethod = loadMemberFunction(robotClass, direction)

    runAndCheckSystemOutput("Incorrect output for '$direction' method",
      "${direction.capitalize()} $steps steps") {
      goMethod.call(robot, steps)
    }
  }

  @Test(timeout = TIMEOUT)
  fun testRight() = testDirection("right", 11)

  @Test(timeout = TIMEOUT)
  fun testLeft() = testDirection("left", 37)

  @Test(timeout = TIMEOUT)
  fun testUp() = testDirection("up", 4)

  @Test(timeout = TIMEOUT)
  fun testDown() = testDirection("down", 8)
}