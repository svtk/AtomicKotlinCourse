package whenExpressions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCloudiness {
    private fun expected(cloudiness: Int): String =
            when (cloudiness) {
                in 81..100 -> "Sunny"
                in 61..80 -> "Mostly Sunny"
                in 41..60 -> "Partly Sunny"
                in 21..40 -> "Mostly Cloudy"
                in 0..20 -> "Cloudy"
                else -> throw IllegalArgumentException(
                        "Cloudiness value should be between 0 and 100")
            }

    @Test
    fun test1CorrectValues() {
        for (cloudiness in 0..100) {
            Assert.assertEquals("Wrong result for cloudiness=$cloudiness:",
                    expected(cloudiness), getCloudinessDescription(cloudiness))
        }
    }

    private fun testIncorrectValue(cloudiness: Int) {
        try {
            getCloudinessDescription(cloudiness)
            throw AssertionError("Expected an IllegalArgumentException for cloudiness=$cloudiness")
        } catch (exception: IllegalArgumentException) {
            Assert.assertEquals("Incorrect error message", "Cloudiness value should be between 0 and 100", exception.message)
        }
    }

    @Test
    fun test2Incorrect() = testIncorrectValue(104)

    @Test
    fun test3Incorrect() = testIncorrectValue(-3)
}
