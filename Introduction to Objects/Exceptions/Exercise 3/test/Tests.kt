package exceptions3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExceptions1 {
  @Test(timeout = TIMEOUT)
  fun test1Positive() = Assert.assertEquals("qqq", repeatChar('q', 3))

  @Test(timeout = TIMEOUT)
  fun test2Zero() = Assert.assertEquals("", repeatChar('v', 0))

  @Test(timeout = TIMEOUT)
  fun test2Negative() {
    try {
      repeatChar('v', -5)
      throw AssertionError("""IllegalArgumentException should be thrown for "repeatChar('v', -5)"""")
    } catch (e: IllegalArgumentException) {
      Assert.assertEquals("Incorrect exception message: ", "Count 'n' must be non-negative, but was -5.", e.message)
    }
  }
}