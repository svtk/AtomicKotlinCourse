package whenExpressions2

import org.junit.Assert
import org.junit.Test

class TestTemperature {
    private fun expected(temperature: Int): String =
            when {
                temperature >= 25 -> "Hot"
                temperature in 15..24 -> "Warm"
                temperature in 5..14 -> "Cool"
                temperature in -5..4 -> "Cold"
                else -> "Freezing"
            }

    @Test fun test() {
        for (temperature in -100..110) {
            Assert.assertEquals("Wrong value for temperature=$temperature",
                    expected(temperature), getTemperatureDescription(temperature))
        }
    }
}
