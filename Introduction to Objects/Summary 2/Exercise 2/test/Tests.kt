package summaryIIExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.primaryConstructor

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSummaryIIExercise2 {
  @Test(timeout = TIMEOUT)
  fun test1Functions() {
    val boringClass = loadClass("summaryIIExercise2", "Boring2")
    val aFunction = loadMemberFunction(boringClass, "a")
    val bFunction = loadMemberFunction(boringClass, "b")
    val cFunction = loadMemberFunction(boringClass, "c")
    val constructor = boringClass.primaryConstructor
      ?: throw AssertionError("The Boring2 class doesn't have a primary constructor")
    Assert.assertEquals("The Boring2 primary constructor should have 3 parameters",
      3, constructor.parameters.size)
    checkParametersOfConstructor(constructor, boringClass,
      listOf("" to "kotlin.Double", "" to "kotlin.String", "" to "kotlin.Int"))

    val instance = constructor.call(6.0, "abc", 55)
    fun message(fName: String, value: String) =
      "The '$fName()' function should return $value for 'Boring2(6.0, \"abc\", 55)'"
    Assert.assertEquals(message("a", "6.0"), 6.0, aFunction.call(instance))
    Assert.assertEquals(message("b", "abc"), "abc", bFunction.call(instance))
    Assert.assertEquals(message("c", "55"), 55, cFunction.call(instance))
  }

  @Test(timeout = TIMEOUT)
  fun test2Main() {
    val output = runAndGetSystemOutput(::main)
    Assert.assertTrue("Expected some tests on 'Boring2'", output.isNotEmpty())
  }
}