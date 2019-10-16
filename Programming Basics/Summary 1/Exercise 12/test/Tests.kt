package summaryIExercise12

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTriangle {
  private fun checkOutput(n: Int, expected: String) {
    runAndCheckSystemOutput(
      "Incorrect output for n = $n:",
      expected) {
      printTriangle(n)
    }
  }

  @Test(timeout = TIMEOUT)
  fun testPyramid1() = checkOutput(1, "#\n")

  @Test(timeout = TIMEOUT)
  fun testPyramid2() = checkOutput(2,
    """
                | #
                |###
                |
            """.trimMargin())

  @Test(timeout = TIMEOUT)
  fun testPyramid3() = checkOutput(3,
    """
                |  #
                | ###
                |#####
                |
            """.trimMargin())

  @Test(timeout = TIMEOUT)
  fun testPyramid4() = checkOutput(4,
    """
                |   #
                |  ###
                | #####
                |#######
                |
            """.trimMargin())

  @Test(timeout = TIMEOUT)
  fun testPyramid6() = checkOutput(6,
    """
                |     #
                |    ###
                |   #####
                |  #######
                | #########
                |###########
                |
            """.trimMargin())
}