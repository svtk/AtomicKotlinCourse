package functionTypes2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapNotNull {
    private fun check(
            list: List<Int>
    ) {
        Assert.assertEquals("Wrong result for $list:",
                list.filter { it % 2 == 0 }.map { it * it },
                list.transform2())
        list.transform1()
    }

    @Test
    fun test1Sample() = check(listOf(1, 2, 3))

    @Test
    fun test2() = check(listOf(1, -2, 3, -4))

    @Test
    fun test3() = check(listOf(11, 22, 30))
}