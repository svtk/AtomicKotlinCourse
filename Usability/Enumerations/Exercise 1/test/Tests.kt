package enumerations1

import enumerations1.Direction.*
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestEnumerations {
    class RobotHandler {
        val robot: Robot = Robot()
        val loggedMovements = StringBuilder()

        fun goRight(steps: Int) {
            robot.go(RIGHT, steps)
            loggedMovements.appendln("goRight($steps)")
        }

        fun goLeft(steps: Int) {
            robot.go(LEFT, steps)
            loggedMovements.appendln("goLeft($steps)")

        }

        fun goDown(steps: Int) {
            robot.go(DOWN, steps)
            loggedMovements.appendln("goDown($steps)")

        }

        fun goUp(steps: Int) {
            robot.go(UP, steps)
            loggedMovements.appendln("goUp($steps)")
        }
    }

    private fun testMovements(location: String, movements: RobotHandler.() -> Unit) {
        val robotHandler = RobotHandler()
        robotHandler.movements()
        val actualLocation = robotHandler.robot.location
        val message = if (robotHandler.loggedMovements.isEmpty()) {
            "Initial location of the robot should be (0,0)"
        } else {
            "Wrong location after:\n" + robotHandler.loggedMovements
        }
        Assert.assertEquals(message, location, actualLocation)
    }

    @Test
    fun testInitial() = testMovements("(0,0)") {}

    @Test
    fun testRight() = testMovements("(1,0)") {
        goRight(1)
    }

    @Test
    fun testLeft() = testMovements("(1,0)") {
        goRight(2)
        goLeft(1)
    }

    @Test
    fun testDown() = testMovements("(0,1)") {
        goDown(1)
    }

    @Test
    fun testUp() = testMovements("(0,1)") {
        goDown(2)
        goUp(1)
    }

    @Test
    fun testSeveralSteps() = testMovements("(3,5)") {
        goRight(3)
        goDown(5)
    }

    @Test
    fun testSeveralSteps2() = testMovements("(10,10)") {
        goRight(13)
        goDown(15)
        goUp(5)
        goLeft(3)
    }
}
