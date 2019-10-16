package summaryIExercise10

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCountDigits {
  private fun checkCountDigits(number: Int, digit: Int, expected: Int) {
    Assert.assertEquals("Wrong number of `$digit` digits in the `$number` number",
        expected, countDigits(number, digit))
  }

  @Test(timeout = TIMEOUT)
  fun testCount1() = checkCountDigits(121341, 1, 3)

  @Test(timeout = TIMEOUT)
  fun testCount2() = checkCountDigits(111111, 1, 6)

  @Test(timeout = TIMEOUT)
  fun testCount3() = checkCountDigits(123456789, 1, 1)

  @Test(timeout = TIMEOUT)
  fun testCount4() = checkCountDigits(123456789, 0, 0)

  @Test(timeout = TIMEOUT)
  fun testCount5() = checkCountDigits(111222111, 2, 3)

  @Test(timeout = TIMEOUT)
  fun testCount6() = checkCountDigits(0, 5, 0)
}