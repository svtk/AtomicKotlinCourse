package sealedClassesExercise2
import atomictest.trace
import org.junit.Test
import util.TestTrace
import util.loadClass
import util.loadTraceContent
import kotlin.test.assertEquals

class TestSealedClassesExercise2 : TestTrace() {

    @Test
    fun `#01 main iterates through sealed subclasses of transport`() {
        loadClass("sealedClassesExercise1", "Transport")
            .sealedSubclasses
            .map { it.simpleName }
            .forEach { trace(it) }

        assertEquals(
                message = "Incorrect result of main() invocation",
                actual = loadTraceContent().sorted(),
                expected = listOf(
                        "Bus",
                        "Plane",
                        "Train",
                        "Tram"
                )
        )
    }
}
