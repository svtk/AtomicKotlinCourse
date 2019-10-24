package scopeFunctionsExercise1

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestScopeFunctionsExercise1 {
  private fun checkResult(result: String, funcName: String, vararg possibleAnswers: String) {
    val message = "${possibleAnswers.joinToString()} " +
      "fit${if (possibleAnswers.size == 1) "s" else ""} " +
      "better for '$funcName' use-case"
    Assert.assertTrue(message,
      possibleAnswers.any { result.contains(it) }
    )
  }

  @Test(timeout = TIMEOUT)
  fun test1() = checkResult(example1(X()), "example1", "with", "run", "apply")

  @Test(timeout = TIMEOUT)
  fun test2() = checkResult(example2(Y()), "example2", "run", "apply")

  @Test(timeout = TIMEOUT)
  fun test3() = checkResult(example3(Z()), "example3", "apply")

}