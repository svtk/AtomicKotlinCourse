## Member References (#1)

The starter code includes a `data` class called `Pet` containing a `var String`
property `name` and an `enum` property `habitat`. The `Habitat` enumeration can
be `LAND`, `WATER` or `AMPHIBIOUS`, and it also contains a member function
`livesIn(pet: Pet)` which tests to see whether a `pet` lives in a particular
`Habitat`.

The `main()` starter code creates a `List<Pet>`. Using `filter()` together with
member references, write three expressions to discover which pets in the list
live on land, in the water, or are amphibious. Lastly, use `partition()` to
divide the pets into those that are amphibious and those that are not.

```kotlin
// MemberReferences/MemberReferencesEx1.kt
package memberreferencesex1
import atomictest.eq
import memberreferencesex1.Habitat.*

data class Pet(
  var name: String,
  val habitat: Habitat
) {
  override fun toString() = name
}

enum class Habitat {
  LAND, WATER, AMPHIBIOUS;
  fun livesIn(pet: Pet) = pet.habitat == this
}

fun main() {
  val pets = listOf(
    Pet("Dog", LAND),
    Pet("Cat", LAND),
    Pet("Goldfish", WATER),
    Pet("Turtle", AMPHIBIOUS),
    Pet("Frog", AMPHIBIOUS)
  )
  pets.filter(LAND::livesIn) eq
    "[Dog, Cat]"
  pets.filter(WATER::livesIn) eq
    "[Goldfish]"
  pets.filter(AMPHIBIOUS::livesIn) eq
    "[Turtle, Frog]"
  pets.partition(AMPHIBIOUS::livesIn) eq
    "([Turtle, Frog], [Dog, Cat, Goldfish])"
}
```