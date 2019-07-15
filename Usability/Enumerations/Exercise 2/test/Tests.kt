package enumerations2

import enumerations2.Month.*
import enumerations2.Season.*
import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestEnumerations {
    private val seasons: Map<Month, Season> = mapOf(
            December to Summer, January to Summer, February to Summer,
            March to Autumn, April to Autumn, May to Autumn,
            June to Winter, July to Winter, August to Winter,
            September to Spring, October to Spring, November to Spring
    )

    @Test fun test1Seasons() {
        for (month in Month.values()) {
            Assert.assertEquals("Wrong australian season for $month:", seasons[month], month.getAustralianSeason())
        }
    }

    private fun Month.expected(leapYear: Boolean = false): Int = when (this) {
        January, March, May, July,
        August, October, December -> 31

        April, June, September, November -> 30

        February -> if (leapYear) 29 else 28
    }

    @Test fun test2Days() {
        for (month in Month.values()) {
            Assert.assertEquals("Wrong days for $month:", month.expected(false), month.expected(false))
            Assert.assertEquals("Wrong days for $month in a leap year:", month.expected(true), month.expected(true))
        }
    }
}
