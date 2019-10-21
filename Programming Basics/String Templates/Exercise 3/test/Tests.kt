package stringTemplatesExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.checkParametersOfTopLevelFunction
import util.runAndCheckSystemOutput
import kotlin.reflect.KFunction

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestStringTemplatesExercise3 {
  @Test
  fun testShow() {
    val showFunc = ::show
    checkParametersOfTopLevelFunction(showFunc, listOf(
      "i" to "kotlin.Int",
      "s" to "kotlin.String",
      "c" to "kotlin.Char",
      "d" to "kotlin.Double"
    ))
    testArguments(showFunc, 1, "abc", 'd', 2.0)
    testArguments(showFunc, 193, "string", '&', -7.51)
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
}