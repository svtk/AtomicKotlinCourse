package destructuringDeclarationsExercise1

import org.junit.Test
import kotlin.reflect.KTypeProjection
import kotlin.reflect.full.createType
import kotlin.test.assertEquals

class TestDestructuringDeclarationsExercise1 {
    companion object {
        private val KBoolean = Boolean::class.createType()
        private val KInt = Int::class.createType()
        private val ExpectedKTriple = Triple::class.createType(
                arguments = listOf(
                        KTypeProjection.invariant(KBoolean),
                        KTypeProjection.invariant(KInt),
                        KTypeProjection.invariant(KInt)
                )
        )
    }

    @Test
    fun signature() {
        val actualFun = ::calculate
        assertEquals(
                expected = ExpectedKTriple,
                actual = actualFun.returnType,
                message = "calculate() should return Triple"
        )
    }

    @Test
    fun destructuring() {
        val (a, b, c) = calculate(0, 0)
        assertEquals(
                expected = KBoolean,
                actual = a::class.createType(),
                message = "First destructured value should be Boolean"
        )
        assertEquals(
                expected = KInt,
                actual = b::class.createType(),
                message = "Second destructured value should be Int"
        )
        assertEquals(
                expected = KInt,
                actual = c::class.createType(),
                message = "Third destructured value should be Int"
        )
    }

    @Test
    fun solution() {
        assert(5 to 7, Triple(true, 12, 35))
        assert(11 to 13, Triple(true, 24, 143))
        assert(0 to 100, Triple(true, 100, 0))
        assert(0 to 0, Triple(true, 0, 0))
        assert(0 to -100, Triple(false, 0, 0))
        assert(1 to -1, Triple(false, 0, 0))
        assert(-1 to -1, Triple(false, 0, 0))
        assert(-1 to -1, Triple(false, 0, 0))
    }

    private fun assert(input: Pair<Int, Int>, expectedOutput: Triple<Boolean, Int, Int>) {
        val (a, b) = input
        assertEquals(
                expected = expectedOutput,
                actual = calculate(a, b),
                message = "Incorrect result for 'calculate($a, $b)"
        )
    }
}
