package summary22

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestReverseConversion {
    private fun checkNumber(number: Int, roman: String) {
        Assert.assertEquals("Wrong result for $roman:", number, convertFromRoman(roman))
    }

    @Test
    fun test01Sample1() = checkNumber(23, "XXIII")

    @Test
    fun test02Sample2() = checkNumber(44, "XLIV")

    @Test
    fun test0Sample3() = checkNumber(100, "C")

    @Test
    fun test04Sample4() = checkNumber(2018, "MMXVIII")

    @Test
    fun test05VII() = checkNumber(7, "VII")

    @Test
    fun test06XXXIX() = checkNumber(39, "XXXIX")

    @Test
    fun test07DCLXXXIII() = checkNumber(683, "DCLXXXIII")

    @Test
    fun test08MCMXCIX() = checkNumber(1999, "MCMXCIX")

    @Test
    fun test09CDXCIV() = checkNumber(494, "CDXCIV")

    @Test
    fun test10MDLV() = checkNumber(1555, "MDLV")
}