package ifExpressions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestIfExpressions1 {
    private fun checkFunction(number: Int, sign: String) {
        Assert.assertEquals("""checkSign($number) should return "$sign"""",
                sign, checkSign(number))
    }

    @Test fun test1Positive() = checkFunction(10, "positive")

    @Test fun test2Zero() = checkFunction(0, "zero")

    @Test fun test3Negative() = checkFunction(-10, "negative")
}
