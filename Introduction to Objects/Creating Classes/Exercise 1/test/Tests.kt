package creatingClassesExercise1

import org.junit.Test
import util.runAndCheckSystemOutput
import util.loadClass
import util.loadMemberFunction
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

class TestSomeClass {
  @Test
  fun testSolution() {
    val someClass = loadClass("creatingClassesExercise1", "SomeClass")
    val someInstance = someClass.createInstance()

    testMethod("a", someClass, someInstance)
    testMethod("b", someClass, someInstance)
    testMethod("c", someClass, someInstance)
  }

  private fun testMethod(methodName: String, someClass: KClass<*>, someInstance: Any?) {
    val method = loadMemberFunction(someClass, methodName)

    val message = "The '$methodName' function should display '42' to the console"
    runAndCheckSystemOutput(message, "42") {
      method.call(someInstance)
    }
  }
}