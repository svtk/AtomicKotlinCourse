package functionsExercise2

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestFunctionsExercise2 {
  private fun checkFunction(a: Double, b: Double, c: Double) {
    val sum = a + b + c
    Assert.assertEquals("getSum($a, $b, $c) should return $sum",
        sum, getSum(a, b, c), 0.000001)
  }

  @Test(timeout = TIMEOUT)
  fun test1() = checkFunction(1.0, 2.1, 6.9)

  @Test(timeout = TIMEOUT)
  fun test2() = checkFunction(0.0, 42.0, -42.0)
}