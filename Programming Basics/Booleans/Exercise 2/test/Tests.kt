package booleans2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooleans2 {

    private fun checkAnd(b1: Boolean, b2: Boolean) {
        Assert.assertEquals("and($b1, $b2) should be ${b1 && b2}", b1 && b2, and(b1, b2))
    }

    private fun checkOr(b1: Boolean, b2: Boolean) {
        Assert.assertEquals("or($b1, $b2) should be ${b1 || b2}", b1 || b2, or(b1, b2))
    }

    @Test fun testAnd1() = checkAnd(true, true)

    @Test fun testAnd2() = checkAnd(true, false)

    @Test fun testAnd3() = checkAnd(false, true)

    @Test fun testAnd4() = checkAnd(false, false)

    @Test fun testOr1() = checkOr(true, true)

    @Test fun testOr2() = checkOr(true, false)

    @Test fun testOr3() = checkOr(false, true)

    @Test fun testOr4() = checkOr(false, false)
}
