## Upcasting (#2)

Upcasting also happens when you add an object of a derived type into a
container that holds the base type.

Make a `private var counter = 0` at file scope. Create an `abstract` class
`Apple` that takes an argument `val type: String` to hold the type of apple.
Add a `private val id` which is initialized by getting the value of `counter`
and incrementing it. Inside `init`, use `atomictest.Trace` to record the
`type` and `id`.

Add an `abstract fun consume()` to `Apple`.

From `Apple`, inherit `GrannySmith`, `Gala`, `Fuji` and `Braeburn`. Override
`consume()` so, respectively, they call `trace()` with `chomp GrannySmith`,
`bite Gala`, `press Fuji` and `peel Braeburn`.

In `main()`, make a `List<Apple>` and populate it with the specific types of
`Apple`. Iterate through the list calling `consume()` for each object.

```kotlin
// Upcasting/UpcastExercise2.kt
package upcasting
import atomictest.*

private val trace = Trace()
private var counter = 0

abstract class Apple(val type: String) {
  private val id = counter++
  init {
    trace("$type $id")
  }
  abstract fun consume()
}

class GrannySmith : Apple("GrannySmith") {
  override fun consume() =
    trace("chomp $type")
}

class Gala : Apple("Gala") {
  override fun consume() =
    trace("bite $type")
}

class Fuji : Apple("Fuji") {
  override fun consume() =
    trace("press $type")
}

class Braeburn : Apple("Braeburn") {
  override fun consume() =
    trace("peel $type")
}

fun main() {
  val apples: List<Apple> = listOf(
    GrannySmith(),
    Gala(),
    Fuji(),
    Braeburn()
  )
  apples.forEach { it.consume() }
  trace eq """
    GrannySmith 0
    Gala 1
    Fuji 2
    Braeburn 3
    chomp GrannySmith
    bite Gala
    press Fuji
    peel Braeburn
  """
}
```