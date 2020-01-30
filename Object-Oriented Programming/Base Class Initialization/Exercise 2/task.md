## Base Class Initialization (#2)

Following the instructions in the previous exercise, create a global `private`
`var trace` initialized to `Trace()`. In every class in this exercise, add an
`init` that calls `trace()` to append the name of the class.

Create a class `Plate` and inherit `DinnerPlate` from it. Create a class
`Utensil` and inherit `Spoon`, `Fork` and `Knife` from it. Create a class
`Custom` (as in "a cultural tradition"), and inherit `PlaceSetting` from it.
Inside `PlaceSetting`, create properties containing `Spoon`, `Fork`, `Knife`
and `DinnerPlate`, in that order. Create an instance of `PlaceSetting` to see
the initialization order.

```kotlin
// BaseClassInit/BCIExercise2.kt
package baseclassinit
import atomictest.*

private val trace = Trace()

open class Plate {
  init {
    trace("Plate")
  }
}

class DinnerPlate : Plate() {
  init {
    trace("DinnerPlate")
  }
}

open class Utensil {
  init {
    trace("Utensil")
  }
}

class Spoon : Utensil() {
  init {
    trace("Spoon")
  }
}

class Fork : Utensil() {
  init {
    trace("Fork")
  }
}

class Knife : Utensil() {
  init {
    trace("Knife")
  }
}

open class Custom() {
  init {
    trace("Custom")
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    trace("PlaceSetting")
  }
}

fun main() {
  PlaceSetting()
  trace eq """
    Custom
    Utensil
    Spoon
    Utensil
    Fork
    Utensil
    Knife
    Plate
    DinnerPlate
    PlaceSetting
  """
}
```