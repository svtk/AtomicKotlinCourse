package extensionFunctionsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExtensionFunctionsExercise2 {
  private fun checkQuality(
    number: Int,
    message: String,
    function: Function1<Int, Boolean>,
    check: Boolean
  ) {
    Assert.assertEquals("$number should${if (check) "" else "n't"} be $message:", check, function(number))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkQuality(1, "odd", Int::isOdd, true)

  @Test(timeout = TIMEOUT)
  fun test2Sample() = checkQuality(2, "even", Int::isEven, true)

  @Test(timeout = TIMEOUT)
  fun test3Sample() = checkQuality(13, "even", Int::isEven, false)

  @Test(timeout = TIMEOUT)
  fun test4() = checkQuality(14, "odd", Int::isOdd, false)

  @Test(timeout = TIMEOUT)
  fun test5() = checkQuality(12897, "even", Int::isEven, false)

  @Test(timeout = TIMEOUT)
  fun test6() = checkQuality(12897, "odd", Int::isOdd, true)
}