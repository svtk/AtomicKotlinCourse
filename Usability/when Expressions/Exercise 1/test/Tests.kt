package whenExpressionsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestWhenExpressionsExercise1 {
  private fun expected(cloudiness: Int): String =
    when (cloudiness) {
      in 81..100 -> "Cloudy"
      in 61..80 -> "Mostly Cloudy"
      in 41..60 -> "Partly Sunny"
      in 21..40 -> "Mostly Sunny"
      in 0..20 -> "Sunny"
      else -> throw IllegalArgumentException(
        "Cloudiness value should be between 0 and 100")
    }

  @Test(timeout = TIMEOUT)
  fun test1CorrectValues() {
    for (cloudiness in 0..100) {
      Assert.assertEquals("Wrong result for cloudiness=$cloudiness:",
        expected(cloudiness), cloudiness(cloudiness))
    }
  }

  private fun testIncorrectValue(cloudiness: Int) {
    try {
      cloudiness(cloudiness)
      throw AssertionError("Expected an IllegalArgumentException for cloudiness=$cloudiness")
    } catch (exception: IllegalArgumentException) {
      Assert.assertEquals("Incorrect error message", "Cloudiness value should be between 0 and 100", exception.message)
    }
  }

  @Test(timeout = TIMEOUT)
  fun test2Incorrect() = testIncorrectValue(104)

  @Test(timeout = TIMEOUT)
  fun test3Incorrect() = testIncorrectValue(-3)
}