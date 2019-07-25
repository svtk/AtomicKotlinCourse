package functionTypes1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.collections.map as mapLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
  private fun <T, R> check(
      list: List<T>,
      predicateStr: String,
      predicate: (T) -> R
  ) {
    Assert.assertEquals("Wrong result for $list\n" +
        "predicate = $predicateStr",
        list.map(predicate),
        list.mapLibrary(predicate))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(listOf(1, 2, 3), "\$it!") { "$it!" }

  @Test(timeout = TIMEOUT)
  fun test2() = check(listOf("1", "2", "3"), "{ it.toInt() }") { it.toInt() }

  @Test(timeout = TIMEOUT)
  fun test3() = check(listOf("1", "2", "d"), "{ it.toIntOrNull() }") { it.toIntOrNull() }

  @Test(timeout = TIMEOUT)
  fun test4() = check(listOf('a', 'b', 'd'), "{ it + 1 }") { it + 1 }
}