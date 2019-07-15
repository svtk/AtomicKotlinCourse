package numberTypes2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNumberTypes2 {
    @Test
    fun test1Million() {
        Assert.assertEquals(1_000_000, million)
    }

    @Test
    fun test2Billion() {
        Assert.assertEquals(1_000_000_000, billion)
    }

    @Test
    fun test3Trillion() {
        Assert.assertEquals(1_000_000_000_000, trillion)
    }

    @Test
    fun test4Quintillion() {
        Assert.assertEquals(1_000_000_000_000_000_000, quintillion)
    }

    @Test
    fun test5MillionType() {
        Assert.assertEquals("Int", millionType)
    }

    @Test
    fun test6BillionType() {
        Assert.assertEquals("Int", billionType)
    }

    @Test
    fun test7TrillionType() {
        Assert.assertEquals("Long", trillionType)
    }

    @Test
    fun test8QuintillionType() {
        Assert.assertEquals("Long", quintillionType)
    }
}
