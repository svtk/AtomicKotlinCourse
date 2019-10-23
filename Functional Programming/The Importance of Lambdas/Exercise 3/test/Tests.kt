package theImportanceOfLambdasExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTheImportanceOfLambdasExercise3 {
    private fun testString(s: String) {
        Assert.assertEquals("Wrong result for '$s'",
          s.filterIndexed { index, _ -> index % 2 == 0 }, other(s))
    }

    @Test(timeout = TIMEOUT)
    fun test1() = testString("cement")

    @Test(timeout = TIMEOUT)
    fun test2() = testString("abcdef")

    @Test(timeout = TIMEOUT)
    fun test3() = testString("1234567890")

    @Test(timeout = TIMEOUT)
    fun test4() = testString(('A'..'Z').joinToString(""))
}