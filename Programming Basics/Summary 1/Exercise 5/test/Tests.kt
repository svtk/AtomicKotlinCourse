package summaryIExercise5

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSummaryIExercise5 {
    private fun testOutput(start: Int, end: Int) {
        val expected = (start..end)
          .filterIndexed { index, _ -> index % 5 == 4 }
          .joinToString("\n")

        runAndCheckSystemOutput("Wrong output for 'everyFifth($start, $end)'", expected) {
            everyFifth(start, end)
        }
    }

    @Test(timeout = TIMEOUT)
    fun test1() = testOutput(11, 30)

    @Test(timeout = TIMEOUT)
    fun test2() = testOutput(1, 5)

    @Test(timeout = TIMEOUT)
    fun test3() = testOutput(3, 14)

    @Test(timeout = TIMEOUT)
    fun test4() = testOutput(-20, 20)

    @Test(timeout = TIMEOUT)
    fun test5() = testOutput(1, 4)

    @Test(timeout = TIMEOUT)
    fun test6() = testOutput(0, 44)

    @Test(timeout = TIMEOUT)
    fun test7() = testOutput(100, 150)
}