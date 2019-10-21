package testingExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.runAndGetSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTestingExercise2 {
    @Test
    fun test1Sum() {
        Assert.assertEquals("The 'sum(1, 2, 3)' call returns the wrong result",
          6, sum(1, 2, 3))
    }

    @Test
    fun test2Main() {
        val output = runAndGetSystemOutput(::main)
        Assert.assertTrue("All the tests are expected to succeed, " +
          "the output should contain no 'Error'", "Error" !in output)
        Assert.assertTrue("The 'sum' function is expected to be tested for " +
          "at least five different argument combinations", output.lines().size >= 5)
    }
}