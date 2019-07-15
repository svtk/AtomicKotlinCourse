package lists2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCountOccurrences {

    private fun checkOccurrences(list: List<Int>, number: Int, result: Int) {
        val intList = IntList(list)
        Assert.assertEquals("Incorrect maximum for $intList", result, countOccurrences(intList, number))
    }

    @Test
    fun test1OneElement() {
        checkOccurrences(listOf(1), 1, 1)
    }

    @Test
    fun test2TwoElements() {
        checkOccurrences(listOf(1, 1), 1, 2)
    }

    @Test
    fun test3EmptyList() {
        checkOccurrences(listOf(), 1, 0)
    }

    @Test
    fun test4SeveralElements() {
        checkOccurrences(listOf(6, 2, 7, 7, 19, 7, 21), 7, 3)
    }

    @Test
    fun test5OnlyElements() {
        checkOccurrences(listOf(7, 7, 7, 7, 7, 7, 7), 7, 7)
    }
}