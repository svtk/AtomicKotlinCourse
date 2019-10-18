package dataTypesExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.untestable

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestDataTypesExercise3 {
    @Test(timeout = TIMEOUT)
    fun testA() {
        Assert.assertEquals("Wrong result for 'c1'", 'b', c1)
    }

    @Test(timeout = TIMEOUT)
    fun testB() {
        Assert.assertEquals("Wrong result for 'c2'", 'z', c2)
    }

    @Test(timeout = TIMEOUT)
    fun testC() {
        Assert.assertEquals("Wrong result for 'c3'", 'C', c3)
    }
}