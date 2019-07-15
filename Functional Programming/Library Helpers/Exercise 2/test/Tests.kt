package libraryHelpers2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPersonsMap {
    private fun check(actual: String, expected: String) {
        Assert.assertEquals("Wrong result for sample",
                expected,
                actual)

    }

    @Test
    fun test1Sample() {
        val sb = StringBuilder()
        with(sb) {
            append("0")
        }
        check(sb.toString(), "0")

    }
    @Test
    fun test2Sample() {
        check(StringBuilder().run {
            append("1")
            toString()
        }, "1")
    }

    @Test
    fun test3Sample() {
        check(StringBuilder().let {
            it.append("2")
            it.toString()
        }, "2")
    }

    @Test
    fun test4Sample() {
        check(StringBuilder().apply {
            append("3")
        }.toString(), "3")
    }

    @Test
    fun test5Sample() {
        check(StringBuilder().also {
            it.append("4")
        }.toString(), "4")
    }
}