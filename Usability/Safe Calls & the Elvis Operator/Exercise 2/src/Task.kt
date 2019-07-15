package safeCallsandTheElvisOperator2

data class Client(
        val name: String,
        val personalInfo: PersonalInfo? = null)

data class PersonalInfo(
        val email: String? = null,
        val address: Address? = null)

data class Address(
        val country: String? = null,
        val city: String? = null,
        val street: String? = null)

fun checkUnspecified(s: String?) = s
        ?: "Unspecified"

fun Client.getFullInfo(): String =  """
       |name: $name
       |email: ${checkUnspecified(personalInfo?.email)}
       |country: ${checkUnspecified(personalInfo?.address?.country)}
       |city: ${checkUnspecified(personalInfo?.address?.city)}
       |street: ${checkUnspecified(personalInfo?.address?.street)}
    """.trimMargin()

fun main() {
    val alice = Client("Alice",
            PersonalInfo(
                    email = "alice@gmail.com",
                    address = Address("Germany", "Munich")))
    println(alice.getFullInfo())
    println("---")
    println(Client("Bob").getFullInfo())
}
/* Output:
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
---
name: Bob
email: Unspecified
country: Unspecified
city: Unspecified
street: Unspecified
*/