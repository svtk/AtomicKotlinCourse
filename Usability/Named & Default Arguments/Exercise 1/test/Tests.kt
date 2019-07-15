package namedandDefaultArguments1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import java.time.LocalTime

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSimpleTime {
    private fun testSimpleTime(
            hours: Int,
            minutes: Int = 0,
            seconds: Int = 0,
            nanoseconds: Int = 0
    ) {
        val time = SimpleTime(hours, minutes, seconds, nanoseconds)

        val localTime = LocalTime.of(hours, minutes, seconds, nanoseconds)
        fun message(functionName: String) =
                "Wrong '$functionName' for SimpleTime(hours = $hours, " +
                "minutes = $minutes, seconds = $seconds, nanoseconds = $nanoseconds)"
        Assert.assertEquals(message("toSecondOfDay"), localTime.toSecondOfDay(), time.toSecondOfDay())
        Assert.assertEquals(message("toNanoOfDay"), localTime.toNanoOfDay(), time.toNanoOfDay())
    }

    @Test
    fun test1Sample() = testSimpleTime(12)

    @Test
    fun test2Sample() = testSimpleTime(6, 30)

    @Test
    fun test3Sample() = testSimpleTime(0, 0, 1)

    @Test
    fun test4Sample() = testSimpleTime(0, 0, 0, 1)

    @Test
    fun test5() = testSimpleTime(2, 12, 27)

    @Test
    fun test6() = testSimpleTime(1, 1, 1, 1)

    @Test
    fun test7() = testSimpleTime(11, 59, 59, 999999999)

    @Test
    fun test8() = testSimpleTime(5, 31)
}

fun SimpleTime(hours: Any?, minutes: Any?, seconds: Any?, nanoseconds: Any?): SimpleTime = TODO()