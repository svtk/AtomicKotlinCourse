package objectsEverywhere1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestClassesAndObjects1 {

    private fun checkPalindrome(s: String, expected: Boolean) {
        Assert.assertEquals("""Wrong result for 'isPalindrome("$s")':""", expected, isPalindrome(s))
    }

    @Test fun testPalindrome1() = checkPalindrome("mom", true)

    @Test fun testPalindrome2() = checkPalindrome("dad", true)

    @Test fun testPalindrome3() = checkPalindrome("street", false)

    @Test fun testPalindrome4() = checkPalindrome("brr", false)

    @Test fun testPalindrome5() = checkPalindrome("A", true)

    @Test fun testPalindrome6() = checkPalindrome("rr", true)

    @Test fun testPalindrome7() = checkPalindrome("abccba", true)

    @Test fun testPalindrome8() = checkPalindrome("abcba", true)

    @Test fun testPalindrome9() = checkPalindrome("qwertyuiopoiuytrewq", true)
}
