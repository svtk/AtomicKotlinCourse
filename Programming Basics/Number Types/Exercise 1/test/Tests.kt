package numberTypesExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNumberTypesExercise1 {
  @Test(timeout = TIMEOUT)
  fun testA() {
    Assert.assertEquals("Wrong result for 'a'", 3, a)
  }

  @Test(timeout = TIMEOUT)
  fun testB() {
    Assert.assertEquals("Wrong result for 'b'", 2, b)
  }

  @Test(timeout = TIMEOUT)
  fun testC() {
    Assert.assertEquals("Wrong result for 'c'", 11, c)
  }

  @Test(timeout = TIMEOUT)
  fun testD() {
    Assert.assertEquals("Wrong result for 'd'", 1.2, d.toDouble(), 0.0001)
  }
}