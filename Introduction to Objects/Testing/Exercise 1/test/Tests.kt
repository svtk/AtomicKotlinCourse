package testingExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndGetSystemOutput
import kotlin.math.absoluteValue

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTestingExercise1 {

  private fun checkFunction(number: Int) {
    val abs = number.absoluteValue
    Assert.assertEquals("abs($number) should return $abs",
      abs, ifExpressionsExercise2.abs(number))
  }

  @Test(timeout = TIMEOUT)
  fun testAbs1() = checkFunction(1)

  @Test(timeout = TIMEOUT)
  fun testAbs2() = checkFunction(-3)

  @Test(timeout = TIMEOUT)
  fun testAbs3() = checkFunction(-1001)

  @Test(timeout = TIMEOUT)
  fun testAbs4() = checkFunction(0)

  @Test
  fun testOutput() {
    val output = runAndGetSystemOutput(::main)
    fun checkArgument(arg: Int) {
      Assert.assertTrue(
        "The 'abs($arg)' call should be tested using 'eq'",
        arg.absoluteValue.toString() in output)
    }
    checkArgument(0)
    checkArgument(42)
    checkArgument(-239)
  }
}