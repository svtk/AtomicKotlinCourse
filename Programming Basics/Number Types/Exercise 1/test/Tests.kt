package numberTypes1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNumberTypes1 {
    @Test fun testA() {
        Assert.assertEquals(3, a)
    }

    @Test fun testB() {
        Assert.assertEquals(2, b)
    }

    @Test fun testC() {
        Assert.assertEquals(11, c)
    }

    @Test fun testD() {
        Assert.assertEquals(1.2, d.toDouble(), 0.0001)
    }
}