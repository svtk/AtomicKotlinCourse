package localFunctionsExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadFileFacade
import util.loadToplevelFunction
import kotlin.reflect.typeOf
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@OptIn(ExperimentalStdlibApi::class)
class TestLocalFunctionsExercise3 {
    @Test
    fun `#01 function signature`() {
        val createContainerFunc = ::createContainer
        assertEquals(
                actual = createContainerFunc.returnType,
                expected = typeOf<Pair<(Int) -> Unit, () -> Int?>>(),
                message = "Invalid return type of the 'createContainer' function'"
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
