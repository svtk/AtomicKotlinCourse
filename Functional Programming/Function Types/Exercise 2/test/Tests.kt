package functionTypes.exercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapNotNull {
  private fun check(
      list: List<Int>
  ) {
    Assert.assertEquals("Wrong result for $list:",
        list.filter { it % 2 == 0 }.map { it * it },
        list.transformVersion2())
    list.transformVersion1()
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(listOf(1, 2, 3))

  @Test(timeout = TIMEOUT)
  fun test2() = check(listOf(1, -2, 3, -4))

  @Test(timeout = TIMEOUT)
  fun test3() = check(listOf(11, 22, 30))
}