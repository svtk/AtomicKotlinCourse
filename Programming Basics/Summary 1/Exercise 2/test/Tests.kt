package summaryIExercise2

import org.junit.Assert
import org.junit.Test

class TestSummaryIExercise2 {
    private fun testString(s: String) {
        Assert.assertEquals("Wrong result for '$s'",
          s.filterIndexed { index, _ -> index % 2 == 0 }, other(s))
    }

    @Test
    fun test1() = testString("cement")

    @Test
    fun test2() = testString("abcdef")

    @Test
    fun test3() = testString("1234567890")

    @Test
    fun test4() = testString(('A'..'Z').joinToString(""))
}