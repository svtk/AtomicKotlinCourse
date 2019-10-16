package theInKeywordExercise4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestValidIdentifier {

  private fun checkValidIdentifier(s: String) {
    Assert.assertTrue("'$s' is a valid identifier", isValidIdentifier(s))
  }

  private fun checkInvalidIdentifier(s: String) {
    Assert.assertFalse("'$s' is not a valid identifier", isValidIdentifier(s))
  }

  @Test(timeout = TIMEOUT)
  fun test01Simple() = checkValidIdentifier("name")

  @Test(timeout = TIMEOUT)
  fun test02StartsWithUnderscore() = checkValidIdentifier("_name")

  @Test(timeout = TIMEOUT)
  fun test03Underscore() = checkValidIdentifier("_")

  @Test(timeout = TIMEOUT)
  fun test04ContainsDigits() = checkValidIdentifier("n01")

  @Test(timeout = TIMEOUT)
  fun test05UpperCase() = checkValidIdentifier("NNN")

  @Test(timeout = TIMEOUT)
  fun test06Valid() = checkValidIdentifier("_N01")

  @Test(timeout = TIMEOUT)
  fun test07Empty() = checkInvalidIdentifier("")

  @Test(timeout = TIMEOUT)
  fun test08StartsWithDigit() = checkInvalidIdentifier("0name")

  @Test(timeout = TIMEOUT)
  fun test09ContainsIllegalCharacters() = checkInvalidIdentifier("&%$")

  @Test(timeout = TIMEOUT)
  fun test10FirstIllegal() = checkInvalidIdentifier("1_")

  @Test(timeout = TIMEOUT)
  fun test11SomeIllegal() = checkInvalidIdentifier("na me")

  @Test(timeout = TIMEOUT)
  fun test12SomeIllegal() = checkInvalidIdentifier("name.")

  @Test(timeout = TIMEOUT)
  fun test13SomeIllegal() = checkInvalidIdentifier(".name")
}