package sequencesExercise7

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput
import kotlin.test.assertFalse
import kotlin.test.expect

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSequencesExercise7 {

    @Test(timeout = TIMEOUT)
    fun `#01 no 1 digit in first 10`() {
        val result = oddWithoutDigitOne().take(10).joinToString(" ")
        assertFalse("First 10 members contains \"1\": $result") {
            result.contains("1")
        }
    }

    @Test(timeout = TIMEOUT)
    fun `#02 no 1 digit in first 100`() {
        val result = oddWithoutDigitOne().take(100).joinToString(" ")
        assertFalse("First 100 members contains \"1\": $result") {
            result.contains("1")
        }
    }

    @Test(timeout = TIMEOUT)
    fun `#03 first member`() {
        expect(3, "Incorrect initial sequence member") {
            oddWithoutDigitOne().first()
        }
    }

    @Test(timeout = TIMEOUT)
    fun `#04 start subsequence`() {
        expect(
                expected = listOf(3, 5, 7, 9, 23, 25, 27, 29),
                message = "Incorrect initial sequence member"
        ) {
            oddWithoutDigitOne().take(8).toList()
        }
    }

    @Test(timeout = TIMEOUT)
    fun `#05 main output`() {
        runAndCheckSystemOutput(
                expectedOutput = "680",
                message = "Incorrect sum of the first 20 members of sequence"
        ) {
            main()
        }
    }
}
