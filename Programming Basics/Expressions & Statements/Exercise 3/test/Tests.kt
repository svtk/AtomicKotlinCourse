package expressionsAndStatementsExercise3

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestExpressionsAndStatementsExercise3 {
  @Test(timeout = TIMEOUT)
  fun test() {
    Assert.assertEquals("Your guess is incorrect", 2, yourGuess)
  }
}