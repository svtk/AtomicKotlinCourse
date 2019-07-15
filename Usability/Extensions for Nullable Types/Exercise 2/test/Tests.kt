package extensionsforNullableTypes2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExtensionsForNullable {

    private fun checkValues(receiver: Boolean?, argument: Boolean?) {
        Assert.assertEquals("Wrong result for $receiver.and($argument)",
                receiver.and(argument), expectedAnd(receiver, argument))
        Assert.assertEquals("Wrong result for $receiver.or($argument)",
                receiver.or(argument), expectedOr(receiver, argument))
    }

    private fun expectedAnd(receiver: Boolean?, argument: Boolean?): Boolean? =
            if (receiver != null && argument != null) receiver && argument else null

    private fun expectedOr(receiver: Boolean?, argument: Boolean?): Boolean? =
            if (receiver != null && argument != null) receiver || argument else null

    @Test
    fun testAll() {
        val booleans = listOf(true, false)
        for (first in booleans) {
            for (second in booleans) {
                checkValues(first, second)
            }
        }
    }
}