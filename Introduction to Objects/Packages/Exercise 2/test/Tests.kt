package packagesExercise2

import org.junit.Assert
import org.junit.Test
import util.runAndGetSystemOutput
import util.untestable
import kotlin.math.E
import kotlin.math.PI

class TestPackagesExercise2 {
  @Test
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