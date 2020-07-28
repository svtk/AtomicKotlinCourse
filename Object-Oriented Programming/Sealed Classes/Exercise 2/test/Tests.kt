package sealedClassesExercise2

import org.junit.Test
import util.loadFileFacade
import util.loadMainFunction
import util.loadTraceContent
import kotlin.test.assertEquals

class TestSealedClassesExercise2 {

    private val packageName = "sealedClassesExercise2"

    @Test
    fun `#01 main iterates through sealed subclasses of transport`() {
        val mainMethod = loadMainFunction(loadFileFacade(packageName))
        mainMethod.invoke(null)

        assertEquals(
                message = "Incorrect result of main() invocation",
                actual = loadTraceContent(packageName).sorted(),
                expected = listOf(
                        "Bus",
                        "Plane",
                        "Train",
                        "Tram"
                )
        )
    }
}
