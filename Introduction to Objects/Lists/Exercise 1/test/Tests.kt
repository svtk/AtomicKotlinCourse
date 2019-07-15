package lists1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMaxInList {
    private fun checkMaximum(list: List<Int>, max: Int) {
        val intList = IntList(list)
        Assert.assertEquals("Incorrect maximum for $intList", max, findMax(intList))
    }

    @Test
    fun test1OneElement() {
        checkMaximum(listOf(1), 1)
    }

    @Test
    fun test2TwoElements() {
        checkMaximum(listOf(1, 4), 4)
    }

    @Test
    fun test3EmptyList() {
        checkMaximum(listOf(), 0)
    }

    @Test
    fun test4SeveralElements() {
        checkMaximum(listOf(6, 2, 111, 7, 19, 21, 50), 111)
    }

    @Test
    fun testFirstMax() {
        checkMaximum(listOf(111, 6, 2, 7, 19, 21, 50), 111)
    }

    @Test
    fun test5LastMax() {
        checkMaximum(listOf(6, 2, 7, 19, 21, 50, 111), 111)
    }
}