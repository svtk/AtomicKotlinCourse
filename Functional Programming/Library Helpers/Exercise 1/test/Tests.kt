package libraryHelpers1

import org.junit.Assert
import org.junit.Test

class Tests {
    private fun checkResult(result: String, vararg possibleAnswers: String) {
        val message = "${possibleAnswers.joinToString()} " +
            "fit${if (possibleAnswers.size == 1) "s" else ""} " +
            "better for this use-case"
        Assert.assertTrue(message,
            possibleAnswers.any { result.contains(it) }
        )
    }

    @Test
    fun test1() = checkResult(example1(X()), "with", "run", "apply")

    @Test
    fun test2() = checkResult(example2(Y()), "run", "apply")

    @Test
    fun test3() = checkResult(example3(Z()), "apply")

}