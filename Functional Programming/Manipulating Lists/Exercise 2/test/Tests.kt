package manipulatingLists2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
    private fun <T> check(
            list: List<T>
    ) {
        Assert.assertEquals("Wrong result for $list:",
                list.zip(list.indices),
                list.zipWithIndex())
    }

    @Test
    fun test1Sample() = check(listOf('a', 'b', 'c'))

    @Test
    fun test2() = check(listOf(1, 2, 3, 4, 5))

    @Test
    fun test3() = check(listOf("ab", "bd"))

    @Test
    fun test4() = check(listOf<Any>())
}