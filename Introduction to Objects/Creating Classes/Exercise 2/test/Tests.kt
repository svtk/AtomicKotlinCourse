package creatingClasses2

import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class TestGiraffe {
  @Test
  fun testSolution() {
    val giraffeClass =
        try {
          ClassLoader.getSystemClassLoader().loadClass("creatingClasses2.Giraffe")
        } catch (e: ClassNotFoundException) {
          throw AssertionError("Can't find the 'Giraffe' class in 'creatingClasses2' package")
        }
    val giraffeInstance = giraffeClass.constructors.first().newInstance()

    val displayIDMethod =
        try {
          giraffeClass.getMethod("displayID")
        } catch (e: NoSuchMethodException) {
          throw AssertionError("Can't find the 'displayID()' member function in 'Giraffe' class")
        }

    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    displayIDMethod.invoke(giraffeInstance)

    val output = byteArrayOutputStream.toString().trim()
    val message = "The 'displayID' function should display the address of the object, " +
        "something like '30c7da1e'\n" +
        "was: $output"
    Assert.assertTrue(message, output.toIntOrNull(16) != null)
  }
}