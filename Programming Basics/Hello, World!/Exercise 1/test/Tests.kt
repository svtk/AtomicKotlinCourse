package helloWorldExercise1

import org.junit.Test
import util.loadFileFacade
import util.loadToplevelFunction
import util.runAndCheckSystemOutput

class TestHelloWorldExercise1 {
  @Test
  fun test() {
    val fileFacade = loadFileFacade("helloWorldExercise1", "Task")
    val mainFunction = loadToplevelFunction(fileFacade, "main")
    runAndCheckSystemOutput("Wrong output", "Hello, Kotlin!") {
      mainFunction.invoke(Object())
    }
  }
}