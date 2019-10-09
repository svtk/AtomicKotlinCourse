import org.junit.Assert
import org.junit.Test
import stringTemplates3.show
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter

class TestShowFunction {
  @Test
  fun testShow() {
    val showMethod = ::show
    Assert.assertEquals("'show' method should have 4 parameters", 4, showMethod.parameters.size)
    val (i, s, c, d) = showMethod.parameters
    checkParameter(i, "i", "kotlin.Int")
    checkParameter(s, "s", "kotlin.String")
    checkParameter(c, "c", "kotlin.Char")
    checkParameter(d, "d", "kotlin.Double")

    testArguments(showMethod, 1, "abc", 'd', 2.0)
    testArguments(showMethod, 193, "string", '&', -7.51)
  }

  private fun testArguments(showMethod: KFunction<*>, i: Int, s: String, c: Char, d: Double) {
    val byteArrayOutputStream = ByteArrayOutputStream()
    System.setOut(PrintStream(byteArrayOutputStream))

    val message = "Incorrect output for 'show' function call"
    val expectedOutput = """
        i: $i
        s: "$s"
        c: '$c'
        d: $d
      """.trimIndent()
    showMethod.call(i, s, c, d)

    val output = byteArrayOutputStream.toString().trim()
    Assert.assertEquals(message, expectedOutput, output)
  }

  private fun checkParameter(i: KParameter, expectedName: String, expectedType: String) {
    Assert.assertEquals("The name of the first parameter should be '$expectedName'", expectedName, i.name)
    Assert.assertEquals("The type of the first parameter should be '$expectedType'", expectedType, i.type.toString())
  }
}