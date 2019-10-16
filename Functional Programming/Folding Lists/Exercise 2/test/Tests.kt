package foldingListsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.collections.count as countLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFoldingListsExercise2 {
  private fun <T> checkCount(list: List<T>, predicateString: String, predicate: (T) -> Boolean) {
    Assert.assertEquals("Wrong implementation for 'count'. Wrong result for counting $predicateString in $list", list.countLibrary(predicate), list.count(predicate))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkCount(listOf(1, -2, 3), "{ it > 0 }") { it > 0 }

  @Test(timeout = TIMEOUT)
  fun test2() = checkCount(listOf("abc", "cd", "eea"), "{ it.contains('a') }") { it.contains('a') }
}