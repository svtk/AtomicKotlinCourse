package objectsEverywhere3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestClassesAndObjects3 {
  private fun checkPalindrome(s: String, expected: Boolean) {
    Assert.assertEquals("""Wrong result for isPalIgnoreSpecial("$s"):""", expected, isPalIgnoreSpecial(s))
  }

  @Test(timeout = TIMEOUT)
  fun testPalindrome0() = checkPalindrome("AAA!", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome1() = checkPalindrome("Was It A Rat I Saw? ...", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome2() = checkPalindrome("A Man, A Plan, A Canal-Panama!", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome3() = checkPalindrome("Madam In Eden, I'm Adam", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome4() = checkPalindrome("Mr. Owl Ate My Metal Worm", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome5() = checkPalindrome("A Santa Lived As a Devil At NASA", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome6() = checkPalindrome("Dammit, I'm Mad! ...", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome7() = checkPalindrome("Do Geese See God?", true)

  @Test(timeout = TIMEOUT)
  fun testPalindrome8() = checkPalindrome("Not a palindrome!", false)
}