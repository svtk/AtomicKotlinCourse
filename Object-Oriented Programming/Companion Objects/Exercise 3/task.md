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

`ID` only contains a companion object with `idGenerator()` and the code to
support that function: the `size` of each `id`, a random-number generator
seeded to the value of `47`, and a `source` of the characters used to randomly
create the `id`. In `main()`, the output is checked using `test()`, which
generates a `List` of `n` `ID` objects -- modify your code until it matches the
`test()` output in `main()`.

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

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
