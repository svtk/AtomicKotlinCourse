package creatingClasses2

import org.junit.Assert
import org.junit.Test
import util.assertEqualsForOutput
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.AssertionError

class TestFoo {
  @Test
  fun testSolution() {
    val fooClass =
        try {
          ClassLoader.getSystemClassLoader().loadClass("creatingClasses4.Foo")
        } catch (e: ClassNotFoundException) {
          throw AssertionError("Can't find the 'Foo' class in 'creatingClasses4' package")
        }
    val foo = fooClass.constructors.first().newInstance()

    val barMethod =
        try {
          fooClass.getMethod("bar")
        } catch (e: NoSuchMethodException) {
          throw AssertionError("Can't find the 'bar()' member function in 'Foo' class")
        }

    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    barMethod.invoke(foo)

    val output = byteArrayOutputStream.toString()
    Assert.assertTrue("The output should contain @ sign", '@' in output)
    Assert.assertTrue("The output should contain 'Foo'", "Foo" in output)
  }
}