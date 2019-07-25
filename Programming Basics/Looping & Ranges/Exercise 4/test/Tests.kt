package loopingandRanges4

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertEqualsForOutput
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestHalfPyramid {
    private fun checkOutput(n: Int, expected: String) {
        val byteArrayOutputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(byteArrayOutputStream))
        printHalfPyramid(n)
        assertEqualsForOutput("Incorrect output for n = $n:",
                expected, byteArrayOutputStream)
    }

    @Test fun testPyramid1() = checkOutput(1, "#")

    @Test fun testPyramid2() = checkOutput(2,
            """
                |#
                |##
                |
            """.trimMargin())

    @Test fun testPyramid3() = checkOutput(3,
            """
                |#
                |##
                |###
                |
            """.trimMargin())

    @Test fun testPyramid4() = checkOutput(4,
            """
                |#
                |##
                |###
                |####
                |
            """.trimMargin())

    @Test fun testPyramid6() = checkOutput(6,
            """
                |#
                |##
                |###
                |####
                |#####
                |######
                |
            """.trimMargin())

}