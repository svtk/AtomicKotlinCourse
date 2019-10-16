package nonNullAssertionsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNonNullAssertion {
  private fun testResult(list: List<Int>, expected: Int) {
    Assert.assertEquals("Wrong result for $list:", expected, sumOfFirstAndLast(list))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = testResult(listOf(), 0)

  @Test(timeout = TIMEOUT)
  fun test2Sample() = testResult(listOf(1), 1)

  @Test(timeout = TIMEOUT)
  fun test3Sample() = testResult(listOf(1, 2), 3)

  @Test(timeout = TIMEOUT)
  fun test4Sample() = testResult(listOf(1, 2, 3), 4)

  @Test(timeout = TIMEOUT)
  fun test5() = testResult(listOf(1, 7, 11), 12)

  @Test(timeout = TIMEOUT)
  fun test6() = testResult(listOf(11), 11)

  @Test(timeout = TIMEOUT)
  fun test7() = testResult(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 11)
}