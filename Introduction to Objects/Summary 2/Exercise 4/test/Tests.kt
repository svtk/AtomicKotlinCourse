package summaryIIExercise4

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadMemberFunction
import kotlin.reflect.full.primaryConstructor

class TestBoring2 {
  @Test
  fun test1Functions() {
    val boringClass = loadClass("summaryIIExerciseExercise4", "Boring2")
    val aFunction = loadMemberFunction(boringClass, "a")
    val bFunction = loadMemberFunction(boringClass, "b")
    val cFunction = loadMemberFunction(boringClass, "c")
    val constructor = boringClass.primaryConstructor
      ?: throw AssertionError("The Boring2 class doesn't have a primary constructor")
    Assert.assertEquals("The Boring2 primary constructor should have 3 parameters",
      3, constructor.parameters.size)
    val (first, second, third) = constructor.parameters
    Assert.assertEquals("Wrong type of the first constructor parameter", "kotlin.Double", first.type.toString())
    Assert.assertEquals("Wrong type of the second constructor parameter", "kotlin.String", second.type.toString())
    Assert.assertEquals("Wrong type of the third constructor parameter", "kotlin.Int", third.type.toString())
    val instance = constructor.call(6.0, "abc", 55)
    fun message(fName: String, value: String) =
      "The '$fName()' function should return $value for 'Boring2(6.0, \"abc\", 55)'"
    Assert.assertEquals(message("a", "6.0"), 6.0, aFunction.call(instance))
    Assert.assertEquals(message("b", "abc"), "abc", bFunction.call(instance))
    Assert.assertEquals(message("c", "55"), 55, cFunction.call(instance))
  }
}