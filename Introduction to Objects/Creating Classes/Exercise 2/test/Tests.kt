package creatingClasses2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSimpleStringPalIgnoreCase {
    private fun checkPalindrome(s: String, expected: Boolean) {
        Assert.assertEquals("""Wrong result for calling isPalIgnoreCase() on SimpleString("$s"):""",
                expected, isPalIgnoreCase(SimpleString(s)))
    }

    @Test fun testPalindrome1() = checkPalindrome("Bob", true)

    @Test fun testPalindrome2() = checkPalindrome("wwW", true)

    @Test fun testPalindrome3() = checkPalindrome("wWw", true)

    @Test fun testPalindrome4() = checkPalindrome("no palindrome", false)

    @Test fun testPalindrome5() = checkPalindrome("brr", false)

    @Test fun testPalindrome6() = checkPalindrome("A", true)

    @Test fun testPalindrome7() = checkPalindrome("rR", true)
}
