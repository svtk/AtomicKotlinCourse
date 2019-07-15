package lambdawithReceiver2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBuildList {
    private fun check(
            message: String,
            action: MutableList<Int>.() -> Unit
    ) {
        Assert.assertEquals(message,
                mutableListOf<Int>().apply(action),
                buildList(action))

    }

    @Test
    fun test1Sample() = check("Wrong result for sample:") {
        add(0)
        for (i in 1..5) {
            add(i)
        }
    }

    @Test
    fun test2() = check("Wrong result for 'buildList { add(42) }':") {
        add(42)
    }
}