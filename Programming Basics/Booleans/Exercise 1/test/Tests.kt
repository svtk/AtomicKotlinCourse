package booleans.exercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooleans1 {
  @Test(timeout = TIMEOUT)
  fun testA() {
    Assert.assertFalse(a)
  }

  @Test(timeout = TIMEOUT)
  fun testB() {
    Assert.assertTrue(b)
  }

  @Test(timeout = TIMEOUT)
  fun testC() {
    Assert.assertTrue(c)
  }
}