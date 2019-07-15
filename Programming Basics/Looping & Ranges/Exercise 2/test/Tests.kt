package loopingandRanges2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSumOfFactorials {
    @Test fun test1() {
        Assert.assertEquals("sumOfFactorials(1) should be 1",
                1, sumOfFactorials(1))
    }

    @Test fun test2() {
        Assert.assertEquals("sumOfFactorials(3) should be 9",
                9, sumOfFactorials(3))
    }

    @Test fun test3() {
        Assert.assertEquals("sumOfFactorials(10) should be 4037913",
                4037913, sumOfFactorials(10))
    }

    @Test fun test4() {
        Assert.assertEquals("sumOfFactorials(20) should be 2561327494111820313",
                2561327494111820313, sumOfFactorials(20))
    }
}