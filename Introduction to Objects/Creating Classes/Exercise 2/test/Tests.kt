package creatingClasses2

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadMethod
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.reflect.full.createInstance

class TestGiraffe {
  @Test
  fun testSolution() {
    val giraffeClass = loadClass("creatingClasses2", "Giraffe")
    val giraffeInstance = giraffeClass.createInstance()

    val displayIDMethod = loadMethod(giraffeClass, "displayID")

    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    displayIDMethod.call(giraffeInstance)

    val output = byteArrayOutputStream.toString().trim()
    val message = "The 'displayID' function should display the address of the object, " +
        "something like '30c7da1e'\n" +
        "was: $output"
    Assert.assertTrue(message, output.toIntOrNull(16) != null)
  }
}