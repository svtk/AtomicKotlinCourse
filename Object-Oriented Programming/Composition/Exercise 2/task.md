## Composition (#2)

Modify `House3.kt` to replace all the `interface`s with classes, and add a
`name` property to each. Using the same form, add `Bedroom` and `Bathroom`
classes, and a `List<Bathroom>` and `List<Bedroom>` to `House`. Create a
`House` named "Our House", with `Kitchen`s called "Main" and "Guest".  Add
`Bathroom`s called "Master", "Shared", and "Guest". Add `Bedroom`s called
"Master", "Son", "Daughter", and "Guest". Use `atomictest.Trace` to capture all
the class names and `name` properties as the `House` is constructed. Also
notice the order of construction.

```kotlin
// Composition/CompositionExercise2.kt
package compositionex2
import atomictest.*

private val trace = Trace()

open class Building(val name: String) {
  init { trace("Building: $name") }
}

class Kitchen(val name: String)  {
  init { trace("Kitchen: $name") }
}

class Bedroom(val name: String) {
  init { trace("Bedroom: $name") }
}

class Bathroom(val name: String) {
  init { trace("Bathroom: $name") }
}

class House(name: String) : Building(name) {
  val kitchens = listOf(
    Kitchen("Main"),
    Kitchen("Guest")
  )
  val bathrooms = listOf(
    Bathroom("Master"),
    Bathroom("Shared"),
    Bathroom("Guest")
  )
  val bedrooms = listOf(
    Bedroom("Master"),
    Bedroom("Son"),
    Bedroom("Daughter"),
    Bedroom("Guest")
  )
  init { trace("House: $name") }
}

fun main() {
  House("Our House")
  trace eq """
    Building: Our House
    Kitchen: Main
    Kitchen: Guest
    Bathroom: Master
    Bathroom: Shared
    Bathroom: Guest
    Bedroom: Master
    Bedroom: Son
    Bedroom: Daughter
    Bedroom: Guest
    House: Our House
  """
}
```