package creatingClasses1

import org.junit.Assert
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class TestSomeClass {
  @Test
  fun testSolution() {
    val someClass =
        try {
          ClassLoader.getSystemClassLoader().loadClass("creatingClasses1.SomeClass")
        } catch (e: ClassNotFoundException) {
          throw AssertionError("Can't find the 'Foo' class in 'creatingClasses1' package")
        }
    val someInstance = someClass.constructors.first().newInstance()

      testMethod("a", someClass, someInstance)
      testMethod("b", someClass, someInstance)
      testMethod("c", someClass, someInstance)
  }

    private fun testMethod(methodName: String, someClass: Class<*>, someInstance: Any?) {
        val aMethod =
            try {
                someClass.getMethod(methodName)
            } catch (e: NoSuchMethodException) {
                throw AssertionError("Can't find the '$methodName()' member function in 'Foo' class")
            }

        val byteArrayOutputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(byteArrayOutputStream))

        aMethod.invoke(someInstance)

        val output = byteArrayOutputStream.toString().trim()
        val message = "The '$methodName' function should display '42' to the console"
        Assert.assertEquals(message, "42", output)
    }
}