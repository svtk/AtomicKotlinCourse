package manipulatingLists2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
  private fun <T> check(
      list: List<T>
  ) {
    Assert.assertEquals("Wrong result for $list:",
        list.zip(list.indices),
        list.zipWithIndex())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(listOf('a', 'b', 'c'))

  @Test(timeout = TIMEOUT)
  fun test2() = check(listOf(1, 2, 3, 4, 5))

  @Test(timeout = TIMEOUT)
  fun test3() = check(listOf("ab", "bd"))

  @Test(timeout = TIMEOUT)
  fun test4() = check(listOf<Any>())
}