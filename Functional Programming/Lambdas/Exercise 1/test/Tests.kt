package lambdas.exercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooks {
  private fun checkList(list: List<String>) {
    Assert.assertEquals("Wrong result for $list:", transform(list), list.map { it.length })
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkList(listOf("abc", "ab"))

  @Test(timeout = TIMEOUT)
  fun test2Sample() = checkList(listOf("", "abdef", "x"))

  @Test(timeout = TIMEOUT)
  fun test3Sample() = checkList(listOf("123456789"))
}