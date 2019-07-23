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

    @Test fun test01Simple() = checkValidIdentifier("name")

    @Test fun test02StartsWithUnderscore() = checkValidIdentifier("_name")

    @Test fun test03Underscore() = checkValidIdentifier("_")

    @Test fun test04ContainsDigits() = checkValidIdentifier("n01")

    @Test fun test05UpperCase() = checkValidIdentifier("NNN")

    @Test fun test06Valid() = checkValidIdentifier("_N01")

    @Test fun test07Empty() = checkInvalidIdentifier("")

    @Test fun test08StartsWithDigit() = checkInvalidIdentifier("0name")

    @Test fun test09ContainsIllegalCharacters() = checkInvalidIdentifier("&%$")

    @Test fun test10FirstIllegal() = checkInvalidIdentifier("1_")

    @Test fun test11SomeIllegal() = checkInvalidIdentifier("na me")

    @Test fun test12SomeIllegal() = checkInvalidIdentifier("name.")

    @Test fun test13SomeIllegal() = checkInvalidIdentifier(".name")
}
