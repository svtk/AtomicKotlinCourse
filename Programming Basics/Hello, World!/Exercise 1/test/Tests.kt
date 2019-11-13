package helloWorldExercise1

import org.junit.Test
import util.TIMEOUT
import util.loadFileFacade
import util.loadToplevelFunction
import util.runAndCheckSystemOutput

class TestHelloWorldExercise1 {
  @Test(timeout = TIMEOUT)
  fun test() {
    val fileFacade = loadFileFacade("helloWorldExercise1")
    val mainFunction = loadToplevelFunction(fileFacade, "main")
    runAndCheckSystemOutput("Wrong output", "Hello, Kotlin!") {
      mainFunction.invoke(Object())
    }
  }
}