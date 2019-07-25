package lists2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCountOccurrences {

  private fun checkOccurrences(list: List<Int>, number: Int, result: Int) {
    val intList = IntList(list)
    Assert.assertEquals("Incorrect maximum for $intList", result, countOccurrences(intList, number))
  }

  @Test(timeout = TIMEOUT)
  fun test1OneElement() {
    checkOccurrences(listOf(1), 1, 1)
  }

  @Test(timeout = TIMEOUT)
  fun test2TwoElements() {
    checkOccurrences(listOf(1, 1), 1, 2)
  }

  @Test(timeout = TIMEOUT)
  fun test3EmptyList() {
    checkOccurrences(listOf(), 1, 0)
  }

  @Test(timeout = TIMEOUT)
  fun test4SeveralElements() {
    checkOccurrences(listOf(6, 2, 7, 7, 19, 7, 21), 7, 3)
  }

  @Test(timeout = TIMEOUT)
  fun test5OnlyElements() {
    checkOccurrences(listOf(7, 7, 7, 7, 7, 7, 7), 7, 7)
  }
}