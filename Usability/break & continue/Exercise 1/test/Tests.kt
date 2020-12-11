package breakAndContinueExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.TestTrace
import util.loadTraceContent
import util.resetTraceContent
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBreakAndContinueExercise1 : TestTrace() {
  private fun testData(expectedOutput: List<String>, input: List<String>) {
    resetTraceContent()
    readNumbers(*input.toTypedArray())
    assertEquals(expectedOutput, loadTraceContent(),
      "Wrong result for:\n$input\n")
  }

  @Test(timeout = TIMEOUT)
  fun test1() = testData(listOf("Sum: 1"), listOf("1", "0"))

  @Test(timeout = TIMEOUT)
  fun test2() = testData(listOf("Not a number: af", "Sum: 1"), listOf("af", "1", "0"))

  @Test(timeout = TIMEOUT)
  fun test3() = testData(listOf("Sum: 15"), listOf("1", "9", "5", "0"))
}