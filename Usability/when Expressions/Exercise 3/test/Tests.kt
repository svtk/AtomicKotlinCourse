package whenExpressions3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBalancedBraces {
    private fun checkBalanced(s: String, expected: Boolean) {
        Assert.assertEquals("isBalanced($s) should return $expected", isBalanced(s), expected)
    }

    @Test fun test01Balanced() = checkBalanced("()", true)

    @Test fun test02Balanced() = checkBalanced("(()) ()", true)

    @Test fun test03Balanced() = checkBalanced("(()) ((()))", true)

    @Test fun test04Balanced() = checkBalanced("()", true)

    @Test fun test05Unbalanced() = checkBalanced("((", false)

    @Test fun test06Unbalanced() = checkBalanced("))", false)

    @Test fun test07Unbalanced() = checkBalanced(")(", false)

    @Test fun test08Unbalanced() = checkBalanced("(()(())))()", false)

    @Test fun test09Balanced() = checkBalanced("(() () ()) ((()) () (()) () (()))", true)

    private fun checkWrongInput(s: String) {
        try {
            isBalanced(s)
            throw AssertionError("""IllegalArgumentException should be thrown for 'isBalanced("$s")'""")
        } catch (e: IllegalArgumentException) {
            // ok
        }
    }


    @Test fun test10WrongCharacters() = checkWrongInput("1()")

    @Test fun test11WrongCharacters() = checkWrongInput("\\//")

    @Test fun test12WrongCharacters() = checkWrongInput("[][]")
}
