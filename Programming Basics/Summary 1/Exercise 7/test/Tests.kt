package summaryI.exercise7

import org.junit.Test
import util.runAndCheckSystemOutput

class TestWhile {
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