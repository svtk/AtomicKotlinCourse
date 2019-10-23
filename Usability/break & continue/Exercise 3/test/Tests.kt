package breakAndContinueExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBreakAndContinueExercise3 {
  @Test(timeout = TIMEOUT)
  fun test1Main() {
    runAndCheckSystemOutput("Wrong output when calling 'main'", """
            Using break
            before
            analyzing 1
            analyzing 2
            after

            Using continue
            before
            analyzing 1
            analyzing 2
            analyzing 3
            analyzing 4
            after
        """.trimIndent(), ::main)
  }

  private fun checkOutput(funcName: String, input: Any, expectedOutput: String, action: () -> Unit) {
    runAndCheckSystemOutput("Wrong output after calling '$funcName' on $input", expectedOutput, action)
  }

  @Test(timeout = TIMEOUT)
  fun test2UsingBreak() {
    val input = listOf(1, 0, 3)
    checkOutput("usingBreak", input, """
            before
            analyzing 1
            after
        """.trimIndent()) { usingBreak(input) }
  }

  @Test(timeout = TIMEOUT)
  fun test3UsingContinue() {
    val input = listOf(1, 0, 3)
    checkOutput("usingContinue", input, """
            before
            analyzing 1
            analyzing 3
            after
        """.trimIndent()) { usingContinue(input) }
  }

  @Test(timeout = TIMEOUT)
  fun test4AnalyzeList() {
    val input = listOf(1, 0, 3)
    checkOutput("analyzeList", input, """
            analyzing 1
        """.trimIndent()) { analyzeList(input) }
  }

  @Test(timeout = TIMEOUT)
  fun test5AnalyzeElement() {
    val value = 17
    checkOutput("analyzeElement", value, """
            analyzing 17
        """.trimIndent()) { analyzeElement(value) }
  }
}