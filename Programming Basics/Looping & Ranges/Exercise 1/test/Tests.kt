package loopingandRanges1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFactorial {

    @Test fun test1() {
        Assert.assertEquals("1! should be 1",
                1, factorial(1))
    }

    @Test fun test2() {
        Assert.assertEquals("3! should be 6",
                6, factorial(3))
    }

    @Test fun test3() {
        Assert.assertEquals("10! should be 3628800",
                3628800, factorial(10))
    }

    @Test fun test4() {
        Assert.assertEquals("20! should be 2432902008176640000",
                2432902008176640000, factorial(20))
    }

    @Test fun test5() {
        Assert.assertEquals("0! should be 1",
                1, factorial(0))
    }
}