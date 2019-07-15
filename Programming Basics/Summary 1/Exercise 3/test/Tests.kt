package summary3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPyramid {
    private fun checkOutput(n: Int, expected: String) {
        val byteArrayOutputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(byteArrayOutputStream))
        printPyramid(n)
        Assert.assertEquals("Incorrect output for n = $n:",
                expected, byteArrayOutputStream.toString())
    }

    @Test fun testPyramid1() = checkOutput(1, "#\n")

    @Test fun testPyramid2() = checkOutput(2,
            """
                | #
                |###
                |
            """.trimMargin())

    @Test fun testPyramid3() = checkOutput(3,
            """
                |  #
                | ###
                |#####
                |
            """.trimMargin())

    @Test fun testPyramid4() = checkOutput(4,
            """
                |   #
                |  ###
                | #####
                |#######
                |
            """.trimMargin())

    @Test fun testPyramid6() = checkOutput(6,
            """
                |     #
                |    ###
                |   #####
                |  #######
                | #########
                |###########
                |
            """.trimMargin())

}