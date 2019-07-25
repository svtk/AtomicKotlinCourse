package objectsEverywhere1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestClassesAndObjects1 {

  private fun checkPalindrome(s: String, expected: Boolean) {
    Assert.assertEquals("""Wrong result for 'isPalindrome("$s")':""", expected, isPalindrome(s))
  }

  @Test(timeout = TIMEOUT)
  fun testPalindrome1() = checkPalindrome("mom", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome2() = checkPalindrome("dad", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome3() = checkPalindrome("street", false)

  @Test(timeout = TIMEOUT)
  fun testPalindrome4() = checkPalindrome("brr", false)

  @Test(timeout = TIMEOUT)
  fun testPalindrome5() = checkPalindrome("A", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome6() = checkPalindrome("rr", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome7() = checkPalindrome("abccba", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome8() = checkPalindrome("abcba", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome9() = checkPalindrome("qwertyuiopoiuytrewq", true)
}
