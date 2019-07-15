package operationsonCollections2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecond {
    @Test
    fun testSample() {
        fun message(functionName: String) = "Wrong result for '$functionName':"

        val first = listOf(1, 5, 32, 45, 70, 511)

        Assert.assertEquals(message("any"), first.any(operation), true)
        Assert.assertEquals(message("all"), first.all(operation), false)
        Assert.assertEquals(message("none"), first.none(operation), false)
        Assert.assertEquals(message("count"), first.count(operation), 3)
    }
}