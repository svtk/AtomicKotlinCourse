package summary4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import java.io.ByteArrayOutputStream
import java.io.PrintStream

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSnake {
    private fun checkOutput(rows: Int, columns: Int, expected: String) {
        val byteArrayOutputStream = ByteArrayOutputStream()
        System.setOut(PrintStream(byteArrayOutputStream))
        printSnake(rows, columns)
        Assert.assertEquals("Incorrect output for rows = $rows, columns = $columns:",
                expected, byteArrayOutputStream.toString())
    }

    @Test fun testSnake2() = checkOutput(2,2,
            """
                | 0 1
                | 3 2
                |
            """.trimMargin())

    @Test fun testSnake3() = checkOutput(3, 3,
            """
                | 0 1 2
                | 5 4 3
                | 6 7 8
                |
            """.trimMargin())

    @Test fun testSnake4() = checkOutput(4, 5,
            """
                |  0  1  2  3  4
                |  9  8  7  6  5
                | 10 11 12 13 14
                | 19 18 17 16 15
                |
            """.trimMargin())

    @Test fun testSnake5() = checkOutput(10, 11,
            """
                |   0   1   2   3   4   5   6   7   8   9  10
                |  21  20  19  18  17  16  15  14  13  12  11
                |  22  23  24  25  26  27  28  29  30  31  32
                |  43  42  41  40  39  38  37  36  35  34  33
                |  44  45  46  47  48  49  50  51  52  53  54
                |  65  64  63  62  61  60  59  58  57  56  55
                |  66  67  68  69  70  71  72  73  74  75  76
                |  87  86  85  84  83  82  81  80  79  78  77
                |  88  89  90  91  92  93  94  95  96  97  98
                | 109 108 107 106 105 104 103 102 101 100  99
                |
            """.trimMargin())
}