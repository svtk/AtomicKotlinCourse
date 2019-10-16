package summaryIExercise7

import org.junit.Test
import util.runAndCheckSystemOutput

class TestSummaryIExercise7 {
  @Test
  fun test() {
    runAndCheckSystemOutput(
      "Wrong output",
      ".........."
    ) {
      main()
    }
  }
}