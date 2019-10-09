package dataTypes1

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT
import util.runAndGetSystemOutput

class Tests {
  @Test(timeout = TIMEOUT)
  fun checkOutput() {
    val output = runAndGetSystemOutput {
      main()
    }

    Assert.assertTrue("The first line of the error the compiler produces is expected",
      output.trim().isNotEmpty())
  }

  @Test(timeout = TIMEOUT)
  fun checkTypeMismatch() {
    val output = runAndGetSystemOutput {
      main()
    }.toLowerCase()

    Assert.assertTrue("The first line of the error the compiler produces is expected: Type mismatch",
      output.contains("type")
        && output.contains("mismatch"))
  }
}