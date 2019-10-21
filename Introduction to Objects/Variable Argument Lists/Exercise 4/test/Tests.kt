package variableArgumentListsExercise4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestVariableArgumentListsExercise4 {

  private fun checkFlatten(vararg args: List<String>) {
    val list = args.toList()
    Assert.assertEquals("Incorrect result for $list.", list.flatten(), flatten(list))
  }

  @Test(timeout = TIMEOUT)
  fun test1SameList() = checkFlatten(listOf("a", "b"), listOf("c"))

  @Test(timeout = TIMEOUT)
  fun test2SmallerList() = checkFlatten(listOf("a"))

  @Test(timeout = TIMEOUT)
  fun test3FixedNumberOfElements() = checkFlatten(listOf("a", "b"), listOf("c", "d"))

  @Test(timeout = TIMEOUT)
  fun test4ExtraElements() = checkFlatten(listOf("a", "b"), listOf("c", "d"), listOf("e"))
}