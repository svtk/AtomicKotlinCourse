package localFunctionsExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadFileFacade
import util.loadToplevelFunction
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestLocalFunctionsExercise3 {
    @Test
    fun `#01 function signature`() {
        val method = loadToplevelFunction(loadFileFacade("localFunctionsExercise3"), "createContainer")
        assertEquals(
                actual = method.genericReturnType.typeName,
                expected = "kotlin.Pair<kotlin.reflect.KFunction<kotlin.Unit>, kotlin.reflect.KFunction<java.lang.Integer>>",
                message = "Invalid return type of the method"
        )
    }

    @Test
    fun `#02 container usage from main`() {
        val (add, remove) = createContainer()
        assertEquals(null, remove(), "Initial value in the container should be null")
        add(42)
        assertEquals(42, remove(), "Removed value should be equal to the added: 42")
        assertEquals(null, remove(), "Removed value from empty container should be null")
        add(121)
        assertEquals(121, remove(), "Removed value should be equal to the added: 121")
    }
}
