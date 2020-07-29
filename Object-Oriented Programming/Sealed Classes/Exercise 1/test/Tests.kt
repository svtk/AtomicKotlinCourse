package sealedClassesExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSealedClassesExercise1 {

    private val packageName = "sealedClassesExercise1"

    @Test
    fun `#01 classes structure`() {
        listOf(
                "Train" to "line",
                "Bus" to "number",
                "Tram" to "route",
                "Plane" to "flightNumber"
        ).forEach {
            assertDerivedTransport(transportName = it.first, mainParameterName = it.second)
        }
    }

    private fun assertDerivedTransport(transportName: String, mainParameterName: String) {
        loadClass(packageName, transportName).apply {
            assertConstructorNumber(1)
            assertParametersOfFirstConstructor(
                mainParameterName to String::class,
                "capacity" to Int::class
            )
            assertInheritance(this, listOf("Transport"))
        }
    }

    @Test
    fun `#02 travel by chain of transports`() {
        val travel = loadToplevelFunction(loadFileFacade(packageName), "travel")
        listOf(
                listOf("Train", "S1", "200"),
                listOf("Bus", "11", "45"),
                listOf("Tram", "22A Express", "60"),
                listOf("Plane", "1103", "190")
        ).forEach { params ->
            loadClass(packageName, params[0])
                    .createInstance(params[1], params[2].toInt())
                    .also { transport -> travel.invoke(null, transport) }
        }

        assertEquals(
                message = "Incorrect result of travel() invocation",
                actual = loadTraceContent(),
                expected = listOf(
                        "Train S1",
                        "size 200",
                        "Bus 11",
                        "size 45",
                        "Tram 22A Express",
                        "size 60",
                        "Plane 1103",
                        "size 190"
                )
        )
    }
}
