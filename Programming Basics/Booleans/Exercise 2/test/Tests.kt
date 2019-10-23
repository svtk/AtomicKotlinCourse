package booleansExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.checkParametersOfTopLevelFunction
import util.runAndCheckSystemOutput
import util.runAndGetSystemOutput
import kotlin.reflect.KFunction

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooleansExercise2 {
  // TODO: test output for different errors
  @Test(timeout = TIMEOUT)
  fun test1ShowFunctions() {
    testShowAnd(true, true)
    testShowAnd(true, false)
    testShowAnd(false, true)
    testShowAnd(false, false)

    testShowOr(true, true)
    testShowOr(true, false)
    testShowOr(false, true)
    testShowOr(false, false)
  }

  private fun testShowAnd(first: Boolean, second: Boolean) {
    testShowFunc(::showAnd, "$first && $second == ${first && second}", first, second)
  }

  private fun testShowOr(first: Boolean, second: Boolean) {
    testShowFunc(::showOr, "$first || $second == ${first || second}", first, second)
  }

  private fun testShowFunc(
    showFunc: KFunction<*>,
    expectedOutput: String,
    first: Boolean,
    second: Boolean
  ) {
    checkParametersOfTopLevelFunction(showFunc, listOf("first" to "kotlin.Boolean", "second" to "kotlin.Boolean"))
    runAndCheckSystemOutput("Wrong output for '${showFunc.name}($first, $second)'",
      expectedOutput) {
      showFunc.call(first, second)
    }
  }

  @Test(timeout = TIMEOUT)
  fun test2Table() {
    val table = runAndGetSystemOutput { showTruthTable() }
    val expectedLines = """
      true && true == true
      true && false == false
      false && true == false
      false && false == false
      true || true == true
      true || false == true
      false || true == true
      false || false == false
    """.trimIndent().lines()
    expectedLines.forEach {
      Assert.assertTrue("""Not found the line "$it" in the table""",
        it in table)
    }
  }
}