package numberTypes3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNumberTypes3 {
    private fun checkFahrenheitToCelsius(C: Double, F: Int) {
        Assert.assertEquals("$F F should be $C C",
                C, convertFahrenheitToCelsius(F), 0.0001)
    }

    private fun checkCelsiusToFahrenheit(F: Double, C: Int) {
        Assert.assertEquals("$C C should be $F F",
                F, convertCelsiusToFahrenheit(C), 0.0001)
    }

    @Test fun test1FahrenheitToCelsius() = checkFahrenheitToCelsius(-15.0, 5)

    @Test fun test2FahrenheitToCelsius() = checkFahrenheitToCelsius(37.7778, 100)

    @Test fun test3CelsiusToFahrenheit() = checkCelsiusToFahrenheit(5.0, -15)

    @Test fun test4CelsiusToFahrenheit() = checkCelsiusToFahrenheit(68.0, 20)
}
