package moreLibraryFunctions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCreatingSequence {
    @Test
    fun test1Sample() {
        Assert.assertEquals("Wrong result for sample",
                listOf(10, 11),
                from(10).take(2).toList())
    }

    @Test
    fun test2() {
        Assert.assertEquals("Wrong first elements of 'from(1000)' sequence:",
                (1000..1010).toList(),
                from(1000).take(11).toList())
    }
}