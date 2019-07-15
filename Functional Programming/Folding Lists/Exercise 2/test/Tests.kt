package foldingLists02

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.count as countLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCount {
    private fun <T> checkCount(list: List<T>, predicateString: String, predicate: (T) -> Boolean) {
        Assert.assertEquals("Wrong implementation for 'count'. Wrong result for counting $predicateString in $list", list.countLibrary(predicate), list.count(predicate))
    }

    @Test
    fun test1Sample() = checkCount(listOf(1, -2, 3), "{ it > 0 }") { it > 0 }

    @Test
    fun test2() = checkCount(listOf("abc", "cd", "eea"), "{ it.contains('a') }") { it.contains('a') }
}