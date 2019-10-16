package summaryIExercise4

import org.junit.Assert
import org.junit.Test

class TestFirstSecond {
  private fun testFirst(a: Boolean, b: Boolean, c: Boolean) {
    Assert.assertEquals("Wrong result for 'first($a, $b, $c)'",
      first(a, b, c), a && b && c)
  }

  private fun testSecond(a: Boolean, b: Boolean, c: Boolean) {
    Assert.assertEquals("Wrong result for 'second($a, $b, $c)'",
      second(a, b, c), a || b || c)
  }

  @Test
  fun test1() {
    testFirst(true, true, true)
    testFirst(true, true, false)
    testFirst(true, false, true)
    testFirst(false, true, true)
    testFirst(false, false, true)
    testFirst(false, true, false)
    testFirst(true, false, false)
    testFirst(false, false, false)
  }

  @Test
  fun test2() {
    testSecond(true, true, true)
    testSecond(true, true, false)
    testSecond(true, false, true)
    testSecond(false, true, true)
    testSecond(false, false, true)
    testSecond(false, true, false)
    testSecond(true, false, false)
    testSecond(false, false, false)
  }
}