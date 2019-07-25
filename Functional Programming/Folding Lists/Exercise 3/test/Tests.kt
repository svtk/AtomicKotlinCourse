package foldingLists3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.collections.any as anyLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
  private fun <T> checkAny(list: List<T>, predicateString: String, predicate: (T) -> Boolean) {
    Assert.assertEquals("Wrong 'any' implementation. Wrong result for checking $predicateString in $list:", list.anyLibrary(predicate), list.any(predicate))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkAny(listOf(1, -2, 3), "{ it < 0 }") { it < 0 }

  @Test(timeout = TIMEOUT)
  fun test2() = checkAny(listOf("abc", "cd", "eea"), "{ it.contains('a') }") { it.contains('a') }

  @Test(timeout = TIMEOUT)
  fun test3() = checkAny(listOf("abc", "cd", "eea"), "{ it.contains('f') }") { it.contains('f') }
}