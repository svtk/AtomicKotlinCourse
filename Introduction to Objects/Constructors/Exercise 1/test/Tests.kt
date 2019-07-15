package constructors1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRobotClassArguments {
    class RobotHandler(fieldSize: Int, var x: Int, var y: Int) {
        val robot: Robot = Robot(fieldSize, x, y)
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

    private fun testMovements(location: String, fieldSize: Int, x: Int, y: Int,
                              movements: RobotHandler.() -> Unit) {
        val robotHandler = RobotHandler(fieldSize, x, y)
        robotHandler.movements()
        val actualLocation = robotHandler.robot.getLocation()
        val message = if (robotHandler.loggedMovements.isEmpty()) {
            "Initial location of the robot should be ($x,$y)"
        } else {
            "Starting location: ($x, $y), field size: $fieldSize.\n" +
                    "Wrong location after:\n" + robotHandler.loggedMovements
        }
        Assert.assertEquals(message, location, actualLocation)
    }

    @Test
    fun test1Initial() = testMovements("(2,3)", 10, 2, 3) {}

    @Test
    fun test2Right() = testMovements("(3,3)", 10, 2, 3) {
        goRight(1)
    }

    @Test
    fun test3Circle() = testMovements("(2,3)", 10, 2, 3) {
        goRight(10)
        goLeft(10)
        goDown(10)
        goUp(10)
    }
}

fun Robot(vararg a: Any?): Robot = TODO()