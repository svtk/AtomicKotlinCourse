package operationsOnCollectionsExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOperations {
  private fun check(list: List<Int?>) {
    Assert.assertEquals("Wrong result for $list",
        list.filterNotNull().sum(),
        sum(list))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(listOf(1, 2, null))

  @Test(timeout = TIMEOUT)
  fun test2Sample() = check(listOf(null, null, null))

  @Test(timeout = TIMEOUT)
  fun test3() = check(listOf(1, 2, 3))

  @Test(timeout = TIMEOUT)
  fun test4() = check(listOf(1, null, 1, null, 1, null, 1, null))
}