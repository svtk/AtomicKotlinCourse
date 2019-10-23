package ifExpressionsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestIfExpressionsExercise1 {
  private fun checkFunction(number: Int, sign: String) {
    Assert.assertEquals("""checkSign($number) should return "$sign"""",
      sign, checkSign(number))
  }

  @Test(timeout = TIMEOUT)
  fun test1Positive() = checkFunction(10, "positive")

  @Test(timeout = TIMEOUT)
  fun test2Zero() = checkFunction(0, "zero")

  @Test(timeout = TIMEOUT)
  fun test3Negative() = checkFunction(-10, "negative")
}