package manipulatingListsExercise6

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.collections.flatten as flattenLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestManipulatingListsExercise6 {
  private fun <T> checkFlatten(
    list: List<List<T>>
  ) {
    Assert.assertEquals("Wrong 'flatten' implementation",
      list.flattenLibrary(), list.flatten())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkFlatten(listOf(listOf(1, 2, 3), listOf(4, 5, 6)))

  @Test(timeout = TIMEOUT)
  fun test5() = checkFlatten(listOf(listOf('a', 'b'), listOf('c', 'd', 'e', 'f')))
}