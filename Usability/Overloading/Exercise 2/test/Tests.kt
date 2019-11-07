package overloadingExercise2

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT
import util.checkParametersOfMemberFunction
import util.loadClass
import util.runAndCheckSystemOutput
import kotlin.reflect.KFunction
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberFunctions

class TestOverloadingExercise2 {
  private fun testDog(test: (dog: Any?, barkFunc: KFunction<*>) -> Unit) {
    val dogClass = loadClass("overloadingExercise2", "Dog")
    val barkFunctions = dogClass.memberFunctions.filter { it.name == "bark" }
    Assert.assertEquals("Expected only one 'bark' function in the class 'Dog'",
      1, barkFunctions.size)
    val barkFunc = barkFunctions.single()
    checkParametersOfMemberFunction(barkFunc, listOf("n" to "kotlin.Int", "say" to "kotlin.String"))
    Assert.assertEquals("The 'say' parameter of the 'bark' function is expected to have a default value",
      true, barkFunc.parameters.last().isOptional)
    val dogInstance = dogClass.createInstance()
    test(dogInstance, barkFunc)
  }

  @Test(timeout = TIMEOUT)
  fun test1() = testDog { dog, barkFunc ->
    val call = """
      dog.bark(4)
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      woof
      woof
      woof
      woof
    """.trimIndent()) {
      barkFunc.callBy(barkFunc.parameters.zip(listOf(dog, 4)).toMap())
    }
  }

  @Test(timeout = TIMEOUT)
  fun test2() = testDog { dog, barkFunc ->
    val call = """
      dog.bark(3, "wow")
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      wow
      wow
      wow
    """.trimIndent()) {
      barkFunc.call(dog, 3, "wow")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test3() = testDog { dog, barkFunc ->
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
      barkFunc.callBy(barkFunc.parameters.zip(listOf(dog, 3)).toMap())
      barkFunc.call(dog, 2, "wow")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test4() = testDog { dog, barkFunc ->
    val call = """
      dog.bark(1, "wow")
      dog.bark(1)
    """.trimIndent()
    runAndCheckSystemOutput("Wrong output for calling $call", """
      wow
      woof
    """.trimIndent()) {
      barkFunc.call(dog, 1, "wow")
      barkFunc.callBy(barkFunc.parameters.zip(listOf(dog, 1)).toMap())
    }
  }
}