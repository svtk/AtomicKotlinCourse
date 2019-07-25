package creatingClasses2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSimpleStringPalIgnoreCase {
  private fun checkPalindrome(s: String, expected: Boolean) {
    Assert.assertEquals("""Wrong result for calling isPalIgnoreCase() on SimpleString("$s"):""",
        expected, isPalIgnoreCase(SimpleString(s)))
  }

  @Test(timeout = TIMEOUT)
  fun testPalindrome1() = checkPalindrome("Bob", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome2() = checkPalindrome("wwW", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome3() = checkPalindrome("wWw", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome4() = checkPalindrome("no palindrome", false)

  @Test(timeout = TIMEOUT)
  fun testPalindrome5() = checkPalindrome("brr", false)

  @Test(timeout = TIMEOUT)
  fun testPalindrome6() = checkPalindrome("A", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome7() = checkPalindrome("rR", true)
}
