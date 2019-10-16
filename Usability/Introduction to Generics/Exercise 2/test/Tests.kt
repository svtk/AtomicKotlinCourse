package introductionToGenericsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.collections.reversed as reversedLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestIntroductionToGenericsExercise2 {
  private fun <T> checkReversed(list: List<T>) {
    Assert.assertEquals("Wrong result for $list",
        list.reversed(), list.reversedLibrary()
    )
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkReversed(listOf(1, 2, 3))

  @Test(timeout = TIMEOUT)
  fun test2() = checkReversed(listOf('a', 'b', 'c', 'd', 'e'))

  @Test(timeout = TIMEOUT)
  fun test3() = checkReversed(listOf("a"))

  @Test(timeout = TIMEOUT)
  fun test4() = checkReversed(listOf<Int>())

  @Test(timeout = TIMEOUT)
  fun test5() = checkReversed(listOf(null))
}