package localFunctionsExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadFileFacade
import util.loadToplevelFunction
import kotlin.reflect.KClassifier
import kotlin.reflect.KTypeProjection
import kotlin.reflect.full.createType
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestLocalFunctionsExercise2 {
    @Test
    fun `#01 function signature`() {
        val method = loadToplevelFunction(loadFileFacade("localFunctionsExercise2"), "createCounter")
        assertEquals(
                actual = method.genericReturnType.typeName,
                expected = "kotlin.Pair<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<java.lang.Integer>>",
                message = "Invalid return type of the method"
        )
    }

    @Test
    fun `#02 counter methods`() {
        val (inc, value) = createCounter()
        assertEquals(0, value(), "Initial value should be 0")
        inc()
        assertEquals(1, value(), "Increased value should be 1")
    }

    @Test
    fun `#03 counter usage from main`() {
        val (inc, value) = createCounter()
        repeat(10) {
            inc()
        }
        assertEquals(10, value(), "Counter increased 10 times should be equal to 10")
    }
}
