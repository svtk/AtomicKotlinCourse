package whenExpressionsExercise2

import atomictest.eq

fun getTemperatureDescription(temperature: Int): String =
  when {
    temperature >= 25 -> "Hot"
    temperature in 15..24 -> "Warm"
    temperature in 5..14 -> "Cool"
    temperature in -5..4 -> "Cold"
    else -> "Freezing"
  }

fun main() {
  getTemperatureDescription(30) eq "Hot"
  getTemperatureDescription(10) eq "Cool"
  getTemperatureDescription(-30) eq "Freezing"
}