package varargArguments4

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestFlatten {

  private fun checkFlatten(vararg args: List<String>) {
    val list = args.toList()
    Assert.assertEquals("Incorrect result for $list.", list.flatten(), flatten(list))
  }

  @Test(timeout = TIMEOUT)
  fun testSameList() = checkFlatten(listOf("a", "b"), listOf("c"))

  @Test(timeout = TIMEOUT)
  fun testSmallerList() = checkFlatten(listOf("a"))

  @Test(timeout = TIMEOUT)
  fun testFixedNumberOfElements() = checkFlatten(listOf("a", "b"), listOf("c", "d"))

  @Test(timeout = TIMEOUT)
  fun testExtraElements() = checkFlatten(listOf("a", "b"), listOf("c", "d"), listOf("e"))
}