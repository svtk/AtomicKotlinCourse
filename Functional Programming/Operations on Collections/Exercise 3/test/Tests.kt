package operationsonCollections3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOperations {
    private fun check(list: List<Int?>) {
        Assert.assertEquals("Wrong result for $list",
                list.filterNotNull().sum(),
                sum(list))
    }

    @Test
    fun test1Sample() = check(listOf(1, 2, null))

    @Test
    fun test2Sample() = check(listOf(null, null, null))

    @Test
    fun test3() = check(listOf(1, 2, 3))

    @Test
    fun test4() = check(listOf(1, null, 1, null, 1, null, 1, null))
}