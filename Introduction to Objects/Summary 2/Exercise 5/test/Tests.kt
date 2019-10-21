package summaryIIExercise5

import org.junit.Assert
import org.junit.Test
import util.runAndCheckSystemOutput
import kotlin.reflect.KFunction

class TestSummaryIIExercise5 {
    private fun checkParameters(funcName: String, function: KFunction<*>) {
        val params = function.parameters
        Assert.assertEquals("'$funcName' function is expected to have one parameter", 1, params.size)
        Assert.assertTrue("The parameter of '$funcName' function is expected to be 'vararg'",
          params[0].isVararg)
        Assert.assertEquals("The parameter of '$funcName' function is expected to be 'vararg Int'",
          "kotlin.IntArray", params[0].type.toString())
    }

    @Test
    fun testVa1() {
        val va1func = ::va1
        val va2func = ::va2
        checkParameters("va1", va1func)
        checkParameters("va2", va2func)
        runAndCheckSystemOutput("Wrong output after `va1(1, 2)` call",
          """
              va1:
              1
              2
          """.trimIndent()) {
            va1func.call(intArrayOf(1, 2))
        }
        runAndCheckSystemOutput("Wrong output after `va2(3, 4, 5, 6)` call",
          """
              va2:
              va1:
              3
              4
              5
              6
          """.trimIndent()) {
            va2func.call(intArrayOf(3, 4, 5, 6))
        }
    }
}