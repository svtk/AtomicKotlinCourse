package repetitionWithWhileExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.checkParametersOfTopLevelFunction
import util.checkSystemOutput
import util.runAndGetSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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

  @Test(timeout = TIMEOUT)
  fun testDisplayContent() {
    testInput("abc")
    testInput("Kotlin")
    testInput("Hi! I'm a String")
  }
}