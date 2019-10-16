package objectsEverywhereExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestObjectsEverywhereExercise2 {

  private fun checkPalindrome(s: String, expected: Boolean) {
    Assert.assertEquals("""Wrong result for 'isPalIgnoreCase("$s")':""", expected, isPalIgnoreCase(s))
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

  @Test(timeout = TIMEOUT)
  fun testPalindrome8() = checkPalindrome("a.", false)
}