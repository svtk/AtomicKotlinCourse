package exceptionsExercise1

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT
import util.runAndGetSystemOutput
import util.untestable

class TestExceptionsExercise1 {
    @Test(timeout = TIMEOUT)
    fun testOutput() {
        val output = runAndGetSystemOutput(::main)
        Assert.assertTrue("No output for 'main' function", output.isNotEmpty())
        val first = output.lines().first()
        Assert.assertTrue("Wrong output for 'main' function. " +
          "It is expected to start with 'Can't be converted to double: '. " +
          "Was: $first", first.startsWith("Can't be converted to double: "))
        val value = first.substringAfter("Can't be converted to double: ")
        Assert.assertEquals("Wrong result", "1,2", value)
    }
}