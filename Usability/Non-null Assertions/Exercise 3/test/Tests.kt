package nonNullAssertionsExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNonNullAssertionsExercise3 {
  private fun testResult(list: List<Int>, expected: Boolean) {
    Assert.assertEquals("Wrong result for $list:", expected, maxEqualsMinInAbsoluteValue(list))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = testResult(listOf(-10, 1, 10), true)

  @Test(timeout = TIMEOUT)
  fun test2Sample() = testResult(listOf(10, 10), true)

  @Test(timeout = TIMEOUT)
  fun test3Sample() = testResult(listOf(-10, 1), false)

  @Test(timeout = TIMEOUT)
  fun test4() = testResult(listOf(-100, 100, 100), true)

  @Test(timeout = TIMEOUT)
  fun test5() = testResult(listOf(-10, -5, 5, -1, 1), false)

  @Test(timeout = TIMEOUT)
  fun test6() = testResult(listOf(-5, 5, -1, 1, 6), false)
}