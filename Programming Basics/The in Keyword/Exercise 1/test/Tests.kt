package theinKeyword1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAlphabet {
    @Test fun test1() {
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", getAlphabet())
    }
}