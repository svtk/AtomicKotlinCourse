## Inheritance & Extensions (#2)

Refactor `BatteryPet2.kt` to improve the design:

- In `Pet`, add an open function `settle()` which calls `trace("")`
- In `Pet`, add an open function `feed()` which calls `energy.replenish()`
- In `Dog`, override `settle()` to call `trace("Sitting...")
- You no longer need `Dog.sit()`
- Change `playWithDog(dog: Dog)` to `playWithPet(pet: Pet)`
- Add a `CatFood` type of `Energy`, and define the associated `Cat` class
- In `main()`, test all types of `Pet`

```kotlin
// InheritanceExtensions/InhExtensionsEx2.kt
package inheritanceextensionsex2
import atomictest.*

private val trace = Trace()

interface Energy {
  fun replenish() = trace("Fill Bowl")
}

open class Pet(open val energy: Energy) {
  open fun speak() = trace("")
  open fun settle() = trace("")
  open fun feed() = energy.replenish()
}

class DogFood : Energy

open class Dog : Pet(DogFood()) {
  override fun speak() = trace("Bark!")
  override fun settle() = trace("Sitting...")
}

class CatFood : Energy

open class Cat : Pet(CatFood()) {
  override fun speak() = trace("Meow!")
  override fun settle() =
    trace("In my basket...")
}

class Batteries : Energy {
  override fun replenish() =
    trace("Change batteries")
}

class ToyDog: Dog() {
  override val energy = Batteries()
}

fun play(pet: Pet) = pet.speak()

fun playWithPet(pet: Pet) {
  play(pet)
  pet.settle()
  pet.energy.replenish()
}

fun main() {
  val dog1 = Dog()
  val dog2 = ToyDog()
  val cat = Cat()
  playWithPet(dog1)
  playWithPet(dog2)
  playWithPet(cat)
  trace eq """
  Bark!
  Sitting...
  Fill Bowl
  Bark!
  Sitting...
  Change batteries
  Meow!
  In my basket...
  Fill Bowl
  """
}
```