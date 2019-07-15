package extensionProperties1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecond {
    private fun <T> checkSecondFunctions(list: List<T>, second: T?, penultimate: T?) {
        Assert.assertEquals("Wrong `second` element for $list:",
                list.secondOrNull, second)
        Assert.assertEquals("Wrong `penultimate` element for $list:",
                list.penultimateOrNull, penultimate)
    }

    @Test
    fun test1Sample() {
        checkSecondFunctions(listOf(1, 2, 3), 2, 2)
    }

    @Test
    fun test2Sample() {
        checkSecondFunctions(listOf("a", "b", "c", "d"), "b", "c")
    }

    @Test
    fun test3() {
        checkSecondFunctions(listOf('a', 'b', 'c', 'd', 'e', 'f', 'x', 'y', 'z'), 'b', 'y')
    }

    @Test
    fun test4OneElement() {
        checkSecondFunctions(listOf(1), null, null)
    }

    @Test
    fun test5Empty() {
        checkSecondFunctions(listOf(), null, null)
    }
}