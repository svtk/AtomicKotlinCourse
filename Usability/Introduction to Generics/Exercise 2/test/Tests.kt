package introductiontoGenerics2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.reversed as reversedLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestGenerics {
    private fun <T> checkReversed(list: List<T>) {
        Assert.assertEquals("Wrong result for $list",
                list.reversed(), list.reversedLibrary()
        )
    }

    @Test
    fun test1Sample() = checkReversed(listOf(1, 2, 3))

    @Test
    fun test2() = checkReversed(listOf('a', 'b', 'c', 'd', 'e'))

    @Test
    fun test3() = checkReversed(listOf("a"))

    @Test
    fun test4() = checkReversed(listOf<Int>())

    @Test
    fun test5() = checkReversed(listOf(null))
}