package manipulatingLists6

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.flatten as flattenLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFlatten {
    private fun <T> checkFlatten(
            list: List<List<T>>
    ) {
        Assert.assertEquals("Wrong 'flatten' implementation",
                list.flattenLibrary(), list.flatten())
    }

    @Test
    fun test1Sample() = checkFlatten(listOf(listOf(1, 2, 3), listOf(4, 5, 6)))

    @Test
    fun test5() = checkFlatten(listOf(listOf('a', 'b'), listOf('c', 'd', 'e', 'f')))
}