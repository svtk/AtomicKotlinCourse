package summaryIIExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.loadClass
import util.loadMemberFunction
import util.runAndGetSystemOutput
import kotlin.reflect.full.createInstance

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSummaryIIExercise1 {
  @Test(timeout = TIMEOUT)
  fun test1Functions() {
    val boringClass = loadClass("summaryIIExercise1", "Boring")
    val aFunction = loadMemberFunction(boringClass, "a")
    val bFunction = loadMemberFunction(boringClass, "b")
    val cFunction = loadMemberFunction(boringClass, "c")
    val instance = boringClass.createInstance()
    fun message(fName: String, value: String) = "The '$fName()' function should return $value"
    Assert.assertEquals(message("a", "1.618"), 1.618, aFunction.call(instance))
    Assert.assertEquals(message("b", "ratio"), "ratio", bFunction.call(instance))
    Assert.assertEquals(message("c", "11"), 11, cFunction.call(instance))
  }

  @Test(timeout = TIMEOUT)
  fun test2Main() {
    val output = runAndGetSystemOutput {
      main()
    }

    fun message(fName: String) = "The result of '$fName()' function call should be checked in 'main' using 'eq'"
    Assert.assertTrue(message("a"), "1.618" in output)
    Assert.assertTrue(message("b"), "ratio" in output)
    Assert.assertTrue(message("c"), "11" in output)
  }
}