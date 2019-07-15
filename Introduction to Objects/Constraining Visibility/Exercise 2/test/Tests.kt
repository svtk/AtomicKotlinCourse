package constrainingVisibility2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import java.io.ByteArrayOutputStream
import java.io.PrintStream

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
        val byteArrayOutputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(byteArrayOutputStream))

        val robotHandler = RobotHandler()
        robotHandler.movements()

        val steps = robotHandler.loggedSteps
        val incorrectOutput = "Incorrect output after:\n" + robotHandler.loggedMovements
        if (byteArrayOutputStream.toString().isEmpty()) {
            throw AssertionError(incorrectOutput + "\nThe message " +
                    "\"${getErrorMessageText(steps)}\" should be printed to the console")
        }
        Assert.assertEquals(incorrectOutput,
                "${getErrorMessageText(steps)}\n",
                byteArrayOutputStream.toString())
    }


    @Test
    fun test1Right() = testWrongArgumentOutput {
        goRight(-5)
    }

    @Test
    fun test2Left() = testWrongArgumentOutput {
        goLeft(0)
    }

    @Test
    fun test3Up() = testWrongArgumentOutput {
        goUp(-10)
    }

    @Test
    fun test4Down() = testWrongArgumentOutput {
        goDown(-50)
    }
}

fun Robot(vararg a: Any?): Robot = TODO()
