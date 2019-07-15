package repetitionwithwhile1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRepetitionWithWhile {
    private fun checkSum(i: Int) {
        val expectedSum = (1..i).sum()
        Assert.assertEquals("sum($i) should be $expectedSum", expectedSum, sum(i))
    }

    @Test fun testSum1() = checkSum(1)

    @Test fun testSum2() = checkSum(2)

    @Test fun testSum3() = checkSum(5)

    @Test fun testSum4() = checkSum(10)

    @Test fun testSum5() = checkSum(100)
}
