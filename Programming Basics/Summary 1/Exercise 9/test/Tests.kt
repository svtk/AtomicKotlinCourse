package summaryI9

import org.junit.Test
import util.runAndCheckSystemOutput

class TestEveryFifthText {
  private fun testInput(s: String) {
    val expected = s.toList()
      .filter { it != ' ' }
      .filterIndexed { index, _ -> index % 5 == 4 }
      .joinToString("\n")
    runAndCheckSystemOutput("Wrong result for 'everyFifthNonWhitespace()'",
      expected) {
      everyFifthNonWhitespace(s)
    }
  }

  @Test
  fun test1() = testInput("abc d e fgh ik")

  @Test
  fun test2() = testInput("12  3  4  5 6   789  0")

  @Test
  fun test3() = testInput("*       *")

  @Test
  fun test4() = testInput("1               2            345")
}