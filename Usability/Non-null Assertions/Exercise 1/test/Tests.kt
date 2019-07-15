package nonnullAssertions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNonNullAssertion {
    private fun testResult(list: List<Int>, expected: Int) {
        Assert.assertEquals("Wrong result for $list:", expected, sumOfFirstAndLast(list))
    }

    @Test
    fun test1Sample() = testResult(listOf(), 0)

    @Test
    fun test2Sample() = testResult(listOf(1), 1)

    @Test
    fun test3Sample() = testResult(listOf(1, 2), 3)

    @Test
    fun test4Sample() = testResult(listOf(1, 2, 3), 4)

    @Test
    fun test5() = testResult(listOf(1, 7, 11), 12)

    @Test
    fun test6() = testResult(listOf(11), 11)

    @Test
    fun test7() = testResult(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 11)
}