package whenExpressions1

import atomictest.capture
import atomictest.eq

fun getCloudinessDescription(cloudiness: Int): String = 
        when (cloudiness) {
            in 81..100 -> "Sunny"
            in 61..80 -> "Mostly Sunny"
            in 41..60 -> "Partly Sunny"
            in 21..40 -> "Mostly Cloudy"
            in 0..20 -> "Cloudy"
            else -> throw IllegalArgumentException(
                    "Cloudiness value should be between 0 and 100")
        }

fun main(args: Array<String>) {
    getCloudinessDescription(100) eq "Sunny"
    getCloudinessDescription(70) eq "Mostly Sunny"
    getCloudinessDescription(50) eq "Partly Sunny"
    getCloudinessDescription(30) eq "Mostly Cloudy"
    getCloudinessDescription(0) eq "Cloudy"
    capture {
        getCloudinessDescription(1000)
    } eq "IllegalArgumentException: Cloudiness value should be between 0 and 100"
}