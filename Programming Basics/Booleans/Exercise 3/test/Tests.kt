package booleansExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooleansExercise3 {

  private fun checkAnd(b1: Boolean, b2: Boolean) {
    Assert.assertEquals("and($b1, $b2) should be ${b1 && b2}", b1 && b2, and(b1, b2))
  }

  private fun checkOr(b1: Boolean, b2: Boolean) {
    Assert.assertEquals("or($b1, $b2) should be ${b1 || b2}", b1 || b2, or(b1, b2))
  }

  @Test(timeout = TIMEOUT)
  fun testAnd1() = checkAnd(true, true)

  @Test(timeout = TIMEOUT)
  fun testAnd2() = checkAnd(true, false)

  @Test(timeout = TIMEOUT)
  fun testAnd3() = checkAnd(false, true)

  @Test(timeout = TIMEOUT)
  fun testAnd4() = checkAnd(false, false)

  @Test(timeout = TIMEOUT)
  fun testOr1() = checkOr(true, true)

  @Test(timeout = TIMEOUT)
  fun testOr2() = checkOr(true, false)

  @Test(timeout = TIMEOUT)
  fun testOr3() = checkOr(false, true)

  @Test(timeout = TIMEOUT)
  fun testOr4() = checkOr(false, false)
}