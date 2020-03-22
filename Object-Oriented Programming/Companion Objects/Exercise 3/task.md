## Companion Objects (#3)

Create this class:

```kotlin
data class ID(
  val name: String,
  val id: String = idGenerator()
) {
  companion object {
    // ...
    private fun idGenerator() = TODO()
    fun test(n: Int) = List(n) {
      ID(('a' + it).toString())
    }
  }
}
```

`ID` only contains a `companion object` with `idGenerator()` and the code to
support that function: the `size` of each `id`, a random-number generator
seeded to the value of `47`, and a `source` of the characters used to randomly
create the `id`. `test()` is used in `main()` to check the output by generating
a `List` of `n` `ID` objects -- modify your code until it matches the `test()`
output in `main()`.

Now complete this class:

```kotlin
class Bank(val name: String) {
  // Accounts applied for, but not completed:
  private val applied = TODO()
  private val accounts = TODO() // Completed
  private class Account(val name: String) {
    var id: ID? = null
    private var number: Long? = null
    fun addID(verifiedID: ID) = TODO()
    companion object Numbers {
      private fun nextAccountNumber() = TODO()
    }
    fun finish() = TODO()
    override fun toString() = "$id $number"
  }
  fun applyForAccount(name: String) = TODO()
  fun addID(id: ID) = TODO()
  fun completeAccount(verifiedID: ID) = TODO()
  override fun toString() =
    accounts.joinToString("\n")
}
```

This is an example of the *Builder* pattern, for a class that requires multiple
steps during object creation. `applyForAccount()` begins the creation of a new
`Account` and adds it to the `applied` list. `addID()` adds an `ID` object to
the `Account`, and `completeAccount()` takes an `ID`, adds an account `number`,
and moves the `Account` from the `applied` to the `accounts` list.

The starter code in `main()` will validate your solution.

```kotlin
// CompanionObjects/CompanionEx3.kt
package companionobjectex3
import kotlin.random.Random
import atomictest.*

data class ID(
  val name: String,
  val id: String = idGenerator()
) {
  companion object {
    const val size = 10
    private val r = Random(47)
    private val source =
      ('a'..'z') + ('A'..'Z') + ('0'..'9')
    private fun idGenerator() =
      (1..size).map { source.random(r) }
      .joinToString("")
    fun test(n: Int) = List(n) {
      ID(('a' + it).toString())
    }.joinToString(",\n")
  }
}

class Bank(val name: String) {
  private val applied =
    mutableListOf<Account>()
  private val accounts =
    mutableListOf<Account>()
  private class Account(val name: String) {
    var id: ID? = null
    private var number: Long? = null
    fun addID(verifiedID: ID) {
      id = verifiedID
    }
    companion object Numbers {
      private var i: Long = 1000
      private fun nextAccountNumber() = i++
    }
    fun finish() {
      number = nextAccountNumber()
    }
    override fun toString() = "$id $number"
  }
  fun applyForAccount(name: String) =
    applied.add(Account(name))
  fun addID(id: ID) = applied
    .first { it.name == id.name }.addID(id)
  fun completeAccount(verifiedID: ID) {
    val account =
      applied.first { it.id == verifiedID }
    account.finish()
    accounts.add(account)
    applied.remove(account)
  }
  override fun toString() =
    accounts.joinToString("\n")
}

fun main() {
  ID.test(4) eq """
  ID(name=a, id=weazblk9UF),
  ID(name=b, id=LCcPJtUGh5),
  ID(name=c, id=Acs5BzSj6m),
  ID(name=d, id=gHrshDvhwc)
  """.trimIndent()
  val bank = Bank("Jerry's Savings & Loan")
  listOf(ID("Morty Smith"), ID("Beth Smith"),
    ID("Summer Smith")).forEach {
    bank.applyForAccount(it.name)
    bank.addID(it)
    bank.completeAccount(it)
  }
  bank eq """
  ID(name=Morty Smith, id=ePkc0HjTAU) 1000
  ID(name=Beth Smith, id=jjePlEO93w) 1001
  ID(name=Summer Smith, id=C8yaeFEgv6) 1002
  """.trimIndent()
}
```