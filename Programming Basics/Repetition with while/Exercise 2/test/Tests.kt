package repetitionWithWhileExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRepetitionWithWhileExercise2 {
  private fun checkSum(i: Int) {
    val expectedSum = (1..i).sum()
    Assert.assertEquals("sum($i) should be $expectedSum", expectedSum, sum(i))
  }

  @Test(timeout = TIMEOUT)
  fun testSum1() = checkSum(1)

  @Test(timeout = TIMEOUT)
  fun testSum2() = checkSum(2)

  @Test(timeout = TIMEOUT)
  fun testSum3() = checkSum(5)

  @Test(timeout = TIMEOUT)
  fun testSum4() = checkSum(10)

  @Test(timeout = TIMEOUT)
  fun testSum5() = checkSum(100)
}