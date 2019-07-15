package theinKeyword4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestValidIdentifier {

    private fun checkValidIdentifier(s: String) {
        Assert.assertTrue("'$s' is a valid identifier", isValidIdentifier(s))
    }

    private fun checkInvalidIdentifier(s: String) {
        Assert.assertFalse("'$s' is not a valid identifier", isValidIdentifier(s))
    }

    @Test fun test1Simple() = checkValidIdentifier("name")

    @Test fun test2StartsWithUnderscore() = checkValidIdentifier("_name")

    @Test fun test3Underscore() = checkValidIdentifier("_")

    @Test fun test4ContainsDigits() = checkValidIdentifier("n01")

    @Test fun test5UpperCase() = checkValidIdentifier("NNN")

    @Test fun test6Valid() = checkValidIdentifier("_N01")

    @Test fun test7Empty() = checkInvalidIdentifier("")

    @Test fun test8StartsWithDigit() = checkInvalidIdentifier("1_")

    @Test fun test9ContainsIllegalCharacters() = checkInvalidIdentifier("&%$")
}
