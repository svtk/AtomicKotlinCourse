package manipulatingListsExercise5

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.collections.flatMap as flatMapLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestManipulatingListsExercise5 {
  private fun <T, R> checkFlatMap(
    list: List<T>,
    transform: (T) -> List<R>
  ) {
    Assert.assertEquals("Wrong 'flatMap' implementation",
      list.flatMapLibrary(transform),
      list.flatMap(transform))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkFlatMap(listOf(3, 1, 4)) { (0..it).toList() }

  @Test(timeout = TIMEOUT)
  fun test2() = checkFlatMap(listOf(10, 20, 30)) { listOf(it, it + 1, it + 2) }
}