package repetitionWithWhileExercise1

import org.junit.Test
import util.checkParametersOfTopLevelFunction
import util.checkSystemOutput
import util.runAndGetSystemOutput

class TestRepetitionWithWhileExercise1 {
    private fun testInput(s: String) {
        val displayContentFunc = ::displayContent
        checkParametersOfTopLevelFunction(displayContentFunc, listOf("" to "kotlin.String"))
        val output = runAndGetSystemOutput {
            displayContentFunc.call(s)
        }
        val expected = s.toList().joinToString("\n")
        checkSystemOutput("""Wrong output for 'displayContent("$s")'""",
          expected, output)
    }

    @Test
    fun testDisplayContent() {
        testInput("abc")
        testInput("Kotlin")
        testInput("Hi! I'm a String")
    }
}