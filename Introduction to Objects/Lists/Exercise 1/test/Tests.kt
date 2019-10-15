package lists.exercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMaxInList {
  private fun checkMaximum(list: List<Int>, max: Int) {
    val intList = IntList(list)
    Assert.assertEquals("Incorrect maximum for $intList", max, findMax(intList))
  }

  @Test(timeout = TIMEOUT)
  fun test1OneElement() {
    checkMaximum(listOf(1), 1)
  }

  @Test(timeout = TIMEOUT)
  fun test2TwoElements() {
    checkMaximum(listOf(1, 4), 4)
  }

  @Test(timeout = TIMEOUT)
  fun test3EmptyList() {
    checkMaximum(listOf(), 0)
  }

  @Test(timeout = TIMEOUT)
  fun test4SeveralElements() {
    checkMaximum(listOf(6, 2, 111, 7, 19, 21, 50), 111)
  }

  @Test(timeout = TIMEOUT)
  fun testFirstMax() {
    checkMaximum(listOf(111, 6, 2, 7, 19, 21, 50), 111)
  }

  @Test(timeout = TIMEOUT)
  fun test5LastMax() {
    checkMaximum(listOf(6, 2, 7, 19, 21, 50, 111), 111)
  }
}