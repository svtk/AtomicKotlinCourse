package breakAndContinueExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.checkInputOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBreakAndContinueExercise1 {
  private fun testInput(input: String, expectedOutput: String) {
    checkInputOutput("Wrong output for input:\n$input\n", input, expectedOutput, ::readNumbers)
  }

  @Test(timeout = TIMEOUT)
  fun test1() = testInput("1\n0", "Sum: 1")

  @Test(timeout = TIMEOUT)
  fun test2() = testInput("af\n1\n0", "Not a number: af\nSum: 1")

  @Test(timeout = TIMEOUT)
  fun test3() = testInput("1\n9\n5\n0", "Sum: 15")
}