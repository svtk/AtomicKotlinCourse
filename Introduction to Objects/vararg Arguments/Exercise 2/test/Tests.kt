package varargArguments2

import org.junit.Assert
import org.junit.Test

class TestFlatten {

    private fun checkFlatten(vararg args: List<String>) {
        val list = args.toList()
        Assert.assertEquals("Incorrect result for $list.", list.flatten(), flatten(list))
    }

    @Test
    fun testSameList() = checkFlatten(listOf("a", "b"), listOf("c"))

    @Test
    fun testSmallerList() = checkFlatten(listOf("a"))

    @Test
    fun testFixedNumberOfElements() = checkFlatten(listOf("a", "b"), listOf("c", "d"))

    @Test
    fun testExtraElements() = checkFlatten(listOf("a", "b"), listOf("c", "d"), listOf("e"))
}