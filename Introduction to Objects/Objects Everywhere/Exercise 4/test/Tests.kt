package objectsEverywhere4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestReverseNumber {
    private fun checkReverse(number: Int, expected: Int) {
        Assert.assertEquals("Wrong result for reversing $number:",
                expected, reverseDecimal(number))
    }

    @Test fun testReverse1() = checkReverse(1234, 4321)

    @Test fun testReverse2() = checkReverse(10, 1)

    @Test fun testReverse3() = checkReverse(123456789, 987654321)

    @Test fun testReverse4() = checkReverse(111, 111)

    @Test fun testReverse5() = checkReverse(0, 0)
}