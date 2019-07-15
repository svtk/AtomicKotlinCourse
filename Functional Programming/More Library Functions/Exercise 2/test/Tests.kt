package moreLibraryFunctions2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFibonacciSequence {
    @Test
    fun test1Sample() {
        Assert.assertEquals("Wrong result for sample",
                listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34),
                fibonacciNumbers().take(10).toList())
    }
}