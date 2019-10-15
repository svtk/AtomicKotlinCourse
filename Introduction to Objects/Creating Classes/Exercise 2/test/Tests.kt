package creatingClasses.exercise2

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadMemberFunction
import util.runAndGetSystemOutput
import kotlin.reflect.full.createInstance

class TestGiraffe {
  @Test
  fun testSolution() {
    val giraffeClass = loadClass("creatingClasses2", "Giraffe")
    val giraffeInstance = giraffeClass.createInstance()

    val displayIDMethod = loadMemberFunction(giraffeClass, "displayID")

    val output = runAndGetSystemOutput {
      displayIDMethod.call(giraffeInstance)
    }

    val message = "The 'displayID' function should display the address of the object, " +
        "something like '30c7da1e'\n" +
        "was: $output"
    Assert.assertTrue(message, output.trim().toIntOrNull(16) != null)
  }
}