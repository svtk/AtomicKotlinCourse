package recursion1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFactorial {
    private fun check(number: Long, expected: Long) {
        Assert.assertEquals("Wrong result for 'factorial($number)'",
                expected,
                factorial(number))
    }

    @Test
    fun test1Sample() = check(3, 6)

    @Test
    fun test2Sample() = check(4, 24)

    @Test
    fun test3Sample() = check(11, 39916800)

    @Test
    fun test4() = check(13, 6227020800)
}