package properties1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRobotIntro {
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

    @Test
    fun test1Initial() = testMovements("(0,0)") {}

    @Test
    fun test2Right() = testMovements("(1,0)") {
        goRight(1)
    }

    @Test
    fun test3Left() = testMovements("(1,0)") {
        goRight(2)
        goLeft(1)
    }

    @Test
    fun test4Down() = testMovements("(0,1)") {
        goDown(1)
    }

    @Test
    fun test5Up() = testMovements("(0,1)") {
        goDown(2)
        goUp(1)
    }

    @Test
    fun test6SeveralSteps() = testMovements("(3,5)") {
        goRight(3)
        goDown(5)
    }

    @Test
    fun test7SeveralSteps2() = testMovements("(10,10)") {
        goRight(13)
        goDown(15)
        goUp(5)
        goLeft(3)
    }
}
