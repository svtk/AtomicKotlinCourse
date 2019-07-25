package loopingandRanges2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSumOfFactorials {
  @Test(timeout = TIMEOUT)
  fun test1() {
    Assert.assertEquals("sumOfFactorials(1) should be 1",
        1, sumOfFactorials(1))
  }

  @Test(timeout = TIMEOUT)
  fun test2() {
    Assert.assertEquals("sumOfFactorials(3) should be 9",
        9, sumOfFactorials(3))
  }

  @Test(timeout = TIMEOUT)
  fun test3() {
    Assert.assertEquals("sumOfFactorials(10) should be 4037913",
        4037913, sumOfFactorials(10))
  }

  @Test(timeout = TIMEOUT)
  fun test4() {
    Assert.assertEquals("sumOfFactorials(20) should be 2561327494111820313",
        2561327494111820313, sumOfFactorials(20))
  }
}