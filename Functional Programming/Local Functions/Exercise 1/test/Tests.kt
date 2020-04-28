package localFunctionsExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadFileFacade
import util.loadToplevelFunction
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestLocalFunctionsExercise1 {
    @Test
    fun `#01 nested calls of local functions`() {
        assertEquals(47, f(), "Wrong result")
    }
}
