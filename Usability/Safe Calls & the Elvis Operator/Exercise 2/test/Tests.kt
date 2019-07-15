package safeCallsandTheElvisOperator2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestClientFullInfo {
    private fun checkFullInfoRepresentation(client: Client, fullInfo: String) {
        Assert.assertEquals("Wrong full info representation:", fullInfo.trimMargin(), client.getFullInfo())
    }

    @Test
    fun test1Sample() {
        checkFullInfoRepresentation(
                Client("Alice", PersonalInfo(
                        email = "alice@gmail.com",
                        address = Address("Germany", "Munich"))),
                """
                |name: Alice
                |email: alice@gmail.com
                |country: Germany
                |city: Munich
                |street: Unspecified""")
    }

    @Test
    fun test2Sample() {
        checkFullInfoRepresentation(Client("Bob"), """
            |name: Bob
            |email: Unspecified
            |country: Unspecified
            |city: Unspecified
            |street: Unspecified""".trimMargin()
        )
    }

    @Test
    fun test3() {
        checkFullInfoRepresentation(
                Client("Harry", PersonalInfo(
                        address = Address(street = "4 Privet Drive")
                )), """
                |name: Harry
                |email: Unspecified
                |country: Unspecified
                |city: Unspecified
                |street: 4 Privet Drive""".trimMargin())
    }
}