package lambdas1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooks {
    private fun checkList(list: List<String>) {
        Assert.assertEquals("Wrong result for $list:", transform(list), list.map { it.length })
    }

    @Test
    fun test1Sample() = checkList(listOf("abc", "ab"))

    @Test
    fun test2Sample() = checkList(listOf("", "abdef", "x"))

    @Test
    fun test3Sample() = checkList(listOf("123456789"))
}