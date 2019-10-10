package summary11

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestReverseNumber {
  private fun checkReverse(number: Int, expected: Int) {
    Assert.assertEquals("Wrong reversed $number number",
        expected, reverseDecimal(number))
  }

  @Test(timeout = TIMEOUT)
  fun testReverse1() = checkReverse(1234, 4321)

  @Test(timeout = TIMEOUT)
  fun testReverse2() = checkReverse(10, 1)

  @Test(timeout = TIMEOUT)
  fun testReverse3() = checkReverse(123456789, 987654321)

  @Test(timeout = TIMEOUT)
  fun testReverse4() = checkReverse(111, 111)

  @Test(timeout = TIMEOUT)
  fun testReverse5() = checkReverse(0, 0)
}