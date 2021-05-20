package functionsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFunctionsExercise1 {
  private fun testFunction(i: Int) {
    Assert.assertEquals("squareInt($i) should return ${i * i}",
      i * i, squareInt(i))
  }

  @Test(timeout = TIMEOUT)
  fun test1() = testFunction(5)

  @Test(timeout = TIMEOUT)
  fun test2() = testFunction(-3)
}