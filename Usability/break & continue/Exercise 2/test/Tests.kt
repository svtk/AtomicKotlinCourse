package breakAndContinueExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBreakAndContinueExercise2 {
  private fun checkOutputForAnalyzeCall(func: String, strings: List<List<String>>, action: () -> Unit) {
    runAndCheckSystemOutput("Wrong output after calling '$func' on $strings", expectedOutput(strings), action)
  }

  private fun expectedOutput(strings: List<List<String>>): String = buildString {
    for (list in strings) {
      for (string in list) {
        if (string == "stop") break
        appendln(string)
      }
    }
  }

  @Test
  fun test1Main() {
    runAndCheckSystemOutput("Wrong output after calling 'main'", """
      analyzeStrings1:
      a
      b
      first
      second
      analyzeStrings2:
      a
      b
      first
      second
    """.trimIndent(), ::main)
  }

  @Test
  fun test1AnalyzeStrings() {
    val list = listOf(
      listOf("1", "stop", "2")
    )
    checkOutputForAnalyzeCall("analyzeStrings1", list) { analyzeStrings1(list) }
    checkOutputForAnalyzeCall("analyzeStrings2", list) { analyzeStrings2(list) }
  }

  @Test
  fun test2AnalyzeStrings() {
    val list = listOf(
      listOf("stop", "i", "e", "we", "by", "no"),
      listOf("a", "b", "c", "c", "stop", "e", "f")
    )
    checkOutputForAnalyzeCall("analyzeStrings1", list) { analyzeStrings1(list) }
    checkOutputForAnalyzeCall("analyzeStrings2", list) { analyzeStrings2(list) }
  }
}