import atomictest.ERROR_TAG
import org.junit.Assert
import org.junit.runner.JUnitCore
import util.LINE_SEPARATOR
import util.normalizeLineSeparators
import java.io.*
import java.util.function.Consumer

abstract class AbstractTestExamples {
  private val junit = JUnitCore()

  protected fun testExample(fileName: String, main: Runnable) {
    testExample(fileName, Consumer { main.run() })
  }

  protected fun testExample(fileName: String, main: Consumer<Array<String>>) {
    val exampleCode = File(fileName).readText()
    val outputComment = "/* Output:"
    if (exampleCode.contains(outputComment)) {
      val output = extractOutput(exampleCode, outputComment)
      testOutput(output, main, trim = true)
    }
    val inputOutputComment = "/* Input/Output:"
    if (exampleCode.contains(inputOutputComment)) {
      val inputAndOutput = extractOutput(exampleCode, inputOutputComment)
      testInputOutput(inputAndOutput, main)
    } else {
      testNoErrors(main)
    }
  }

  protected fun testUnitTest(testClass: Class<*>) {
    val result = junit.run(testClass)
    Assert.assertTrue(result.wasSuccessful())
  }

  private fun extractOutput(exampleCode: String, outputComment: String) =
      exampleCode.substringAfter(outputComment).substringBefore("*/").trim()

  private fun testOutput(output: String, main: Consumer<Array<String>>, trim: Boolean) {
    val result = runAndGetOutput(main).let {
      if (trim) it.trim() else it
    }
    Assert.assertEquals(result.normalizeLineSeparators(), output.normalizeLineSeparators())
  }

  private fun runAndGetOutput(main: Consumer<Array<String>>): String {
    val out = ByteArrayOutputStream()
    System.setOut(PrintStream(out))

    main.accept(arrayOf())

    return out.toString()
  }

  private fun testInputOutput(inputAndOutput: String, main: Consumer<Array<String>>) {
    val (inputLines, outputLines) = inputAndOutput.lines().partition { it.startsWith(">>>") }
    val input = inputLines.joinToString(LINE_SEPARATOR) { it.substringAfter(">>> ") }
    val output = outputLines.joinToString(LINE_SEPARATOR)

    val inputStream = ByteArrayInputStream(input.toByteArray())
    System.setIn(inputStream)

    val out = ByteArrayOutputStream()
    System.setOut(PrintStream(out))

    main.accept(arrayOf())

    Assert.assertEquals(out.toString().trim().normalizeLineSeparators(), output.normalizeLineSeparators())
  }

  private fun testNoErrors(main: Consumer<Array<String>>) {
    val output = runAndGetOutput(main)
    Assert.assertFalse("Program completed with errors:\n$output", output.contains(ERROR_TAG))
  }
}
