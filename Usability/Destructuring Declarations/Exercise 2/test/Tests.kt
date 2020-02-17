package destructuringDeclarationsExercise2

import org.junit.Test
import kotlin.reflect.full.createType
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class TestDestructuringDeclarationsExercise2 {

    @Test
    fun `class declaration`() {
        val actualFun = Computation::class
        assertFalse(
                actual = actualFun.isData,
                message = "Computation should not be declared as a data class"
        )
    }

    @Test
    fun destructuring() {
        val (value, description) = evaluate(7)
        assertEquals(
                expected = Int::class.createType(),
                actual = value::class.createType(),
                message = "First destructured value should be Int"
        )
        assertEquals(
                expected = String::class.createType(),
                actual = description::class.createType(),
                message = "Second destructured value should be Boolean"
        )
    }

    @Test
    fun solution() {
        assert(3, 6 to "Low")
        assert(7, 14 to "High")
        assert(5, 10 to "Low")
        assert(0, 0 to "Low")
        assert(-1, -2 to "Low")
    }

    private fun assert(input: Int, expectedOutput: Pair<Int, String>) {
        val actualOutput = evaluate(input).let { it.data to it.info }
        assertEquals(expectedOutput, actualOutput, "Incorrect result for evaluate($input)")
    }
}
