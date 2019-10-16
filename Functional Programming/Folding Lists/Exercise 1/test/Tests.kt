package foldingListsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSize {
  private fun <T> checkSize(list: List<T>) {
    Assert.assertEquals("Wrong 'size' for $list:", list.size, list.size())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkSize(listOf(1, 2, 3))

  @Test(timeout = TIMEOUT)
  fun test2() = checkSize(listOf('a', 'b', 'c', 'd', 'e'))

  @Test(timeout = TIMEOUT)
  fun test3() = checkSize(listOf<Int>())

  @Test(timeout = TIMEOUT)
  fun test4() = checkSize(listOf(null))
}