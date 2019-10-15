package variableArgumentLists1

import org.junit.Assert
import org.junit.Test
import util.runAndGetSystemOutput

class TestVarargs1 {
  @Test
  fun testMessageInOutput() {
    val output = runAndGetSystemOutput {
      main()
    }
    val message = "Multiple vararg-parameters are prohibited"
    Assert.assertTrue("The output should contain '$message'.\nWas: $output", message in output)
  }
}