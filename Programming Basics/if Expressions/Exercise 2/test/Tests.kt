package ifExpressions2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestIfExpressions2 {
    private fun checkFunction(number: Int) {
        val abs = if (number > 0) number else -number
        Assert.assertEquals("abs($number) should return $abs",
                abs, abs(number))
    }

    @Test fun testAbs1() = checkFunction(1)

    @Test fun testAbs2() = checkFunction(-3)

    @Test fun testAbs3() = checkFunction(-1001)

    @Test fun testAbs4() = checkFunction(0)
}
