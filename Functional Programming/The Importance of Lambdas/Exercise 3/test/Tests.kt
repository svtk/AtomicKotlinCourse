package theImportanceOfLambdasExercise3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTheImportanceOfLambdasExercise3 {
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