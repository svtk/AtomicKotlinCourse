package summary7

import org.junit.Test
import util.runAndCheckSystemOutput

class TestWhile {
    @Test fun testSolution() {
        runAndCheckSystemOutput(
          "Wrong output",
          "... ... ... ."
        ) {
            main()
        }
    }
}