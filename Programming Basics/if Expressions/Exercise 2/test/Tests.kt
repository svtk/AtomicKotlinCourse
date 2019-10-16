package ifExpressionsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestIfExpressionsExercise2 {
  private fun checkFunction(number: Int) {
    val abs = if (number > 0) number else -number
    Assert.assertEquals("abs($number) should return $abs",
        abs, abs(number))
  }

  @Test(timeout = TIMEOUT)
  fun testAbs1() = checkFunction(1)

  @Test(timeout = TIMEOUT)
  fun testAbs2() = checkFunction(-3)

  @Test(timeout = TIMEOUT)
  fun testAbs3() = checkFunction(-1001)

  @Test(timeout = TIMEOUT)
  fun testAbs4() = checkFunction(0)
}