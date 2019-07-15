package varargArguments1

import org.junit.Assert
import org.junit.Test

class TestLisOfChunks {

    private fun checkListOfChunks(size: Int, vararg elements: String) {
        Assert.assertEquals("Incorrect result for size = $size, elements = ${elements.toList()}.",
                elements.toList().chunked(size), listOfChunks(size, *elements))
    }

    @Test
    fun testSameList() = checkListOfChunks(3, "a", "b", "c")

    @Test
    fun testSmallerList() = checkListOfChunks(3, "a")

    @Test
    fun testFixedNumberOfElements() = checkListOfChunks(2, "a", "b", "c", "d")

    @Test
    fun testExtraElements() = checkListOfChunks(2, "a", "b", "c", "d", "e")
}