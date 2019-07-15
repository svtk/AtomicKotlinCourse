package functions1

import org.junit.Assert
import org.junit.Test

class TestFunctions1 {
    private fun testFunction(i: Int) {
        Assert.assertEquals("getSquare($i) should return ${i * i}",
                i * i, getSquare(i))
    }

    @Test fun test1() = testFunction(5)

    @Test fun test2() = testFunction(-3)
}
