package booleans2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.runAndCheckSystemOutput
import util.runAndGetSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooleans {
  @Test
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
    runAndCheckSystemOutput("Wrong output for 'showAnd($first, $second)",
      "$first && $second == ${first && second}") {
      showAnd(first, second)
    }
  }

  private fun testShowOr(first: Boolean, second: Boolean) {
    runAndCheckSystemOutput("Wrong output for 'showOr($first, $second)",
      "$first || $second == ${first || second}") {
      showOr(first, second)
    }
  }

  @Test
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