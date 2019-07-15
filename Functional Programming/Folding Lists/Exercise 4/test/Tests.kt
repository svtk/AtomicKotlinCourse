package foldingLists4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.any as anyLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestConditions {

    private fun checkSample(isEvenPositiveAndLessThan10: Condition, result: Boolean, value: Int) {
        Assert.assertEquals("Wrong result for 'isEvenPositiveAndLessThan10.check(8)'",
                result, isEvenPositiveAndLessThan10.check(value))
    }

    @Test
    fun testSample() {
        val isPositive = Condition { it > 0 }
        val isEven = Condition { it % 2 == 0 }
        val lessThan10 = Condition { it < 10 }

        val conditions = listOf(isPositive, isEven, lessThan10)
        val isEvenPositiveAndLessThan10 = conditions.combineAll()

        checkSample(isEvenPositiveAndLessThan10, true, 8)
        checkSample(isEvenPositiveAndLessThan10, false, 5)
        checkSample(isEvenPositiveAndLessThan10, false, 12)
    }

    @Test
    fun test2() {
        val isPositive = Condition { it > 0 }
        val isEven = Condition { it % 2 == 0 }
        val lessThan10 = Condition { it < 10 }

        val conditions = listOf(isPositive, isEven, lessThan10)
        val isEvenPositiveAndLessThan10 = conditions.combineAll()

        checkSample(isEvenPositiveAndLessThan10, true, 2)
        checkSample(isEvenPositiveAndLessThan10, false, 7)
        checkSample(isEvenPositiveAndLessThan10, false, 13)
    }
}