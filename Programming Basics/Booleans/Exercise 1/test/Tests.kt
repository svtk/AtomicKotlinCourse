package booleans1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooleans1 {
    @Test fun testA() {
        Assert.assertFalse(a)
    }

    @Test fun testB() {
        Assert.assertTrue(b)
    }

    @Test fun testC() {
        Assert.assertTrue(c)
    }
}