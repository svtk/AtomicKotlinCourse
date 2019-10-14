import org.junit.Assert
import org.junit.Test
import stringTemplates3.show
import util.checkParameters
import util.runAndCheckSystemOutput
import kotlin.reflect.KFunction
import kotlin.reflect.KParameter

class TestShowFunction {
  @Test
  fun testShow() {
    val showMethod = ::show
    checkParameters(showMethod, listOf(
      "i" to "kotlin.Int",
      "s" to "kotlin.String",
      "c" to "kotlin.Char",
      "d" to "kotlin.Double"
    ))
    testArguments(showMethod, 1, "abc", 'd', 2.0)
    testArguments(showMethod, 193, "string", '&', -7.51)
  }

  private fun testArguments(showMethod: KFunction<*>, i: Int, s: String, c: Char, d: Double) {
    val message = "Incorrect output for 'show' function call"
    val expectedOutput = """
        i: $i
        s: "$s"
        c: '$c'
        d: $d
      """.trimIndent()
    runAndCheckSystemOutput(message, expectedOutput) {
      showMethod.call(i, s, c, d)
    }
  }

  private fun checkParameter(i: KParameter, expectedName: String, expectedType: String) {
    Assert.assertEquals("The name of the first parameter should be '$expectedName'", expectedName, i.name)
    Assert.assertEquals("The type of the first parameter should be '$expectedType'", expectedType, i.type.toString())
  }
}