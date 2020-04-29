package destructuringDeclarationsExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.reflect.KTypeProjection
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf
import kotlin.test.assertEquals

@OptIn(ExperimentalStdlibApi::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestDestructuringDeclarationsExercise1 {
    companion object {
        private val KBoolean = typeOf<Boolean>()
        private val KInt = typeOf<Int>()
        private val ExpectedKTriple = typeOf<Triple<Boolean, Int, Int>>()
    }

    @Test
    fun `#1 signature`() {
        val actualFun = ::calculate
        assertEquals(
                expected = ExpectedKTriple,
                actual = actualFun.returnType,
                message = "calculate() should return Triple"
        )
    }

    @Test
    fun `#2 destructuring`() {
        val calculateFun = ::calculate
        val triple = calculateFun.call(0, 0)
          as Triple<Boolean, Int, Int>
        val a = triple.first
        val b = triple.second
        val c = triple.third
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
    fun `#3 solution`() {
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
        val calculateFun = ::calculate
        val actual: Any = calculateFun.call(a, b)
        assertEquals(
                expected = expectedOutput,
                actual = actual,
                message = "Incorrect result for 'calculate($a, $b)"
        )
    }
}
