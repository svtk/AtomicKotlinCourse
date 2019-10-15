package summaryII.exercise14

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestReverseConversion {
  private fun checkNumber(number: Int, roman: String) {
    Assert.assertEquals("Wrong result for $roman:", number, convertFromRoman(roman))
  }

  @Test(timeout = TIMEOUT)
  fun test01Sample1() = checkNumber(23, "XXIII")

  @Test(timeout = TIMEOUT)
  fun test02Sample2() = checkNumber(44, "XLIV")

  @Test(timeout = TIMEOUT)
  fun test0Sample3() = checkNumber(100, "C")

  @Test(timeout = TIMEOUT)
  fun test04Sample4() = checkNumber(2018, "MMXVIII")

  @Test(timeout = TIMEOUT)
  fun test05VII() = checkNumber(7, "VII")

  @Test(timeout = TIMEOUT)
  fun test06XXXIX() = checkNumber(39, "XXXIX")

  @Test(timeout = TIMEOUT)
  fun test07DCLXXXIII() = checkNumber(683, "DCLXXXIII")

  @Test(timeout = TIMEOUT)
  fun test08MCMXCIX() = checkNumber(1999, "MCMXCIX")

  @Test(timeout = TIMEOUT)
  fun test09CDXCIV() = checkNumber(494, "CDXCIV")

  @Test(timeout = TIMEOUT)
  fun test10MDLV() = checkNumber(1555, "MDLV")
}