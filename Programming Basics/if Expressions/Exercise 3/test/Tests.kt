package ifExpressions3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestIfExpressions3 {
  private fun checkFunction(first: Int, second: Int) {
    val max = if (first > second) first else second
    Assert.assertEquals("findMax($first, $second) should return $max",
        max, findMax(first, second))
  }

  @Test(timeout = TIMEOUT)
  fun testMax1() = checkFunction(1, 2)

  @Test(timeout = TIMEOUT)
  fun testMax2() = checkFunction(-1001, 22)

  @Test(timeout = TIMEOUT)
  fun testMax3() = checkFunction(-3, -3)
}
