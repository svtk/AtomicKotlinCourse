package packagesExercise1

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT
import util.runAndGetSystemOutput
import kotlin.math.E
import kotlin.math.PI

class TestPackagesExercise1 {
  @Test(timeout = TIMEOUT)
  fun testConstants() {
    val output = runAndGetSystemOutput(::main)
    fun checkConstant(constantName: String, constant: Double) {
      val message = "Expected value of $constantName displayed to the console: $constant. Was: $output"
      Assert.assertTrue(message, constant.toString() in output)
    }
    checkConstant("PI", PI)
    checkConstant("E", E)
  }
}