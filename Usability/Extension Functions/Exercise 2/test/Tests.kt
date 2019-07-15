package extensionFunctions2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOddEven {
    private fun checkQuality(
            number: Int,
            message: String,
            function: Function1<Int, Boolean>,
            check: Boolean
    ) {
        Assert.assertEquals("$number should${if (check) "" else "n't"} be $message:", check, function(number))
    }

    @Test
    fun test1Sample() = checkQuality(1, "odd", Int::isOdd, true)

    @Test
    fun test2Sample() = checkQuality(2, "even", Int::isEven, true)

    @Test
    fun test3Sample() = checkQuality(13, "even", Int::isEven, false)

    @Test
    fun test4() = checkQuality(14, "odd", Int::isOdd, false)

    @Test
    fun test5() = checkQuality(12897, "even", Int::isEven, false)

    @Test
    fun test6() = checkQuality(12897, "odd", Int::isOdd, true)
}