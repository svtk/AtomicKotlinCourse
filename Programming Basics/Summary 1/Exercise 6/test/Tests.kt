package summaryIExercise6

import org.junit.Test
import util.runAndCheckSystemOutput

class TestSummaryIExercise6 {
  @Test
  fun test1Long() {
    runAndCheckSystemOutput(
      "Wrong output for 'testLong()'",
      "-9223372036854775808") {
      testLong()
    }
  }

  @Test
  fun test2Double() {
    runAndCheckSystemOutput(
      "Wrong output for 'testDouble()'",
      "1.7976931348623157E308") {
      testDouble()
    }
  }
  @Test
  fun test3Double2() {
    runAndCheckSystemOutput(
      "Wrong output for 'testDouble2()'",
      "true") {
      testDouble2()
    }
  }
}