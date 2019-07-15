package safeCallsandTheElvisOperator1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestClientFromMunich {
    @Test
    fun test1SampleFromMunich() {
        val client = Client("Alice",
                PersonalInfo(address = Address("Germany", "Munich")))
        Assert.assertTrue("Client $client comes from Munich",
                client.comesFromMunich())
    }

    @Test
    fun test2SampleNotFromMunich() {
        val client = Client("Bob")
        Assert.assertFalse("Client $client doesn't come from Munich",
                client.comesFromMunich())
    }
}