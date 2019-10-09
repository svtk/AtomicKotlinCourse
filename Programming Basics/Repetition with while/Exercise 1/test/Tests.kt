package repetitionwithwhile1

import org.junit.Test
import util.checkSystemOutput
import util.runAndGetSystemOutput

class TestDisplayContent {
    private fun testInput(s: String) {
        val output = runAndGetSystemOutput {
            displayContent(s)
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