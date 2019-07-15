package operationsonCollections4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOperations {
    private fun check(list: List<Int>) {
        val nonZero = list.all { it != 0 }
        Assert.assertEquals("Wrong result for 'allNonZero($list)'", nonZero, list.allNonZero())
        Assert.assertEquals("Wrong result for 'allNonZero1($list)'", nonZero, list.allNonZero1())
        Assert.assertEquals("Wrong result for 'allNonZero2($list)'", nonZero, list.allNonZero2())

        val hasZero = list.any { it == 0 }
        Assert.assertEquals("Wrong result for 'hasZero($list)'", hasZero, list.hasZero())
        Assert.assertEquals("Wrong result for 'hasZero1($list)'", hasZero, list.hasZero1())
        Assert.assertEquals("Wrong result for 'hasZero2($list)'", hasZero, list.hasZero2())
    }

    @Test
    fun test1Sample() = check(listOf(1, 2, 3))

    @Test
    fun test2Sample() = check(listOf(0, 1, 2))

    @Test
    fun test3() = check(listOf(0, 0, 0))

    @Test
    fun test4() = check(listOf(0, 1, 2, 0, 3, 4))
}