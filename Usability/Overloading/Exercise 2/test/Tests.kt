package overloadingExercise2

import org.junit.Assert
import org.junit.Test
import util.*
import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberFunctions

class TestOverloadingExercise2 {
  private fun testDog(test: (dog: Any?, firstBark: KFunction<*>, secondBark: KFunction<*>) -> Unit) {
    val dogClass = loadClass("overloadingExercise2", "Dog")
    val barkFunctions = dogClass.memberFunctions.filter { it.name == "bark" }
    Assert.assertEquals("Expected two overloaded 'bark' function in the class 'Dog'",
      2, barkFunctions.size)
    val (first, second) = barkFunctions.sortedBy { it.parameters.size }
    checkParametersOfMemberFunction(first, listOf("n" to "kotlin.Int"))
    checkParametersOfMemberFunction(second, listOf("n" to "kotlin.Int", "say" to "kotlin.String"))
    val dogInstance = dogClass.createInstance()
    test(dogInstance, first, second)
  }

  @Test(timeout = TIMEOUT)
  fun test1() = testDog { dog, first, second ->
    val call = """
      dog.bark(4)
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      woof
      woof
      woof
      woof
    """.trimIndent()) {
      first.call(dog, 4)
    }
  }

  @Test(timeout = TIMEOUT)
  fun test2() = testDog { dog, first, second ->
    val call = """
      dog.bark(3, "wow")
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      wow
      wow
      wow
    """.trimIndent()) {
      second.call(dog, 3, "wow")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test3() = testDog { dog, first, second ->
    val call = """
      dog.bark(3)
      dog.bark(2, "wow")
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      woof
      woof
      woof
      wow
      wow
    """.trimIndent()) {
      first.call(dog, 3)
      second.call(dog, 2, "wow")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test4() = testDog { dog, first, second ->
    val call = """
      dog.bark(1, "wow")
      dog.bark(1)
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      wow
      woof
    """.trimIndent()) {
      second.call(dog, 1, "wow")
      first.call(dog, 1)
    }
  }
}