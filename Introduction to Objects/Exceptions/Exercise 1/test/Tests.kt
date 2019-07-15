package exceptions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExceptions1 {
    @Test
    fun test1Positive() = Assert.assertEquals("qqq", repeatChar('q', 3))

    @Test
    fun test2Zero() = Assert.assertEquals("", repeatChar('v', 0))

    @Test
    fun test2Negative() {
        try {
            repeatChar('v', -5)
            throw AssertionError("""IllegalArgumentException should be thrown for "repeatChar('v', -5)"""")
        } catch (e: IllegalArgumentException) {
            Assert.assertEquals("Incorrect exception message: ", "Count 'n' must be non-negative, but was -5.", e.message)
        }
    }
}