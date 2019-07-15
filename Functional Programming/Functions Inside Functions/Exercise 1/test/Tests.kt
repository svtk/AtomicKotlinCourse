package functionsInsideFunctions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFind {
    @Test
    fun test1Sample() {
        Assert.assertEquals("Wrong result for sample", null,
                listOf(1, 2, 3).find { it < 0 })
        Assert.assertEquals("Wrong result for sample", -2,
                listOf(1, -2, -3).find { it < 0 })
    }

    @Test
    fun test2() {
        val list = listOf(1, 2, 0, 2, 4)
        Assert.assertEquals("Wrong result for finding zero in $list", 0,
                list.find { it == 0 })
    }
}