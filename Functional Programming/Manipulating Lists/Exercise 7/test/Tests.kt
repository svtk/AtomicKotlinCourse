package manipulatingLists7

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.filter as filterLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFilter {
    private fun <T> checkFilter(
            list: List<T>,
            predicate: (T) -> Boolean
    ) {
        Assert.assertEquals("Wrong 'filter' implementation",
                list.filterLibrary(predicate), list.filter(predicate))
    }

    @Test
    fun test1Sample() = checkFilter(listOf(1, 12, 22, 31)) { it.toString().contains("2") }

    @Test
    fun test2() = checkFilter(listOf("abc", "cd")) { it.contains('a') }
}