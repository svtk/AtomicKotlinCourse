package summaryIExercise8

import org.junit.Test
import util.runAndCheckSystemOutput

class TestEveryFifth {
    private fun testOutput(start: Int, end: Int) {
        val expected = (start..end)
          .filterIndexed { index, _ -> index % 5 == 4 }
          .joinToString("\n")

        runAndCheckSystemOutput("Wrong output for 'everyFifth($start, $end)'", expected) {
            everyFifth(start, end)
        }
    }

    @Test
    fun test1() = testOutput(11, 30)

    @Test
    fun test2() = testOutput(1, 5)

    @Test
    fun test3() = testOutput(3, 14)

    @Test
    fun test4() = testOutput(-20, 20)

    @Test
    fun test5() = testOutput(1, 4)

    @Test
    fun test6() = testOutput(0, 44)

    @Test
    fun test7() = testOutput(100, 150)
}