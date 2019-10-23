package recursionExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRecursionExercise2 {
  private fun check(number: Long, expected: Long) {
    Assert.assertEquals("Wrong result for 'factorial($number)'",
      expected,
      factorial(number))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(3, 6)

  @Test(timeout = TIMEOUT)
  fun test2Sample() = check(4, 24)

  @Test(timeout = TIMEOUT)
  fun test3Sample() = check(11, 39916800)

  @Test(timeout = TIMEOUT)
  fun test4() = check(13, 6227020800)
}