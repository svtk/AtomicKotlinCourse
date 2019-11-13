package helloWorldExercise1

import org.junit.Test
import util.*

class TestHelloWorldExercise1 {
  @Test(timeout = TIMEOUT)
  fun test() {
    val fileFacade = loadFileFacade("helloWorldExercise1")
    val mainFunction = loadMainFunction(fileFacade)
    runAndCheckSystemOutput("Wrong output", "Hello, Kotlin!") {
      mainFunction.invoke(Object())
    }
  }
}