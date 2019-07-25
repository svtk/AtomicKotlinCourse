package whenExpressions3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBalancedBraces {
  private fun checkBalanced(s: String, expected: Boolean) {
    Assert.assertEquals("isBalanced($s) should return $expected", isBalanced(s), expected)
  }

  @Test(timeout = TIMEOUT)
  fun test01Balanced() = checkBalanced("()", true)

  @Test(timeout = TIMEOUT)
  fun test02Balanced() = checkBalanced("(()) ()", true)

  @Test(timeout = TIMEOUT)
  fun test03Balanced() = checkBalanced("(()) ((()))", true)

  @Test(timeout = TIMEOUT)
  fun test04Balanced() = checkBalanced("()", true)

  @Test(timeout = TIMEOUT)
  fun test05Unbalanced() = checkBalanced("((", false)

  @Test(timeout = TIMEOUT)
  fun test06Unbalanced() = checkBalanced("))", false)

  @Test(timeout = TIMEOUT)
  fun test07Unbalanced() = checkBalanced(")(", false)

  @Test(timeout = TIMEOUT)
  fun test08Unbalanced() = checkBalanced("(()(())))()", false)

  @Test(timeout = TIMEOUT)
  fun test09Balanced() = checkBalanced("(() () ()) ((()) () (()) () (()))", true)

  private fun checkWrongInput(s: String) {
    try {
      isBalanced(s)
      throw AssertionError("""IllegalArgumentException should be thrown for 'isBalanced("$s")'""")
    } catch (e: IllegalArgumentException) {
      // ok
    }
  }


  @Test(timeout = TIMEOUT)
  fun test10WrongCharacters() = checkWrongInput("1()")

  @Test(timeout = TIMEOUT)
  fun test11WrongCharacters() = checkWrongInput("\\//")

  @Test(timeout = TIMEOUT)
  fun test12WrongCharacters() = checkWrongInput("[][]")
}
