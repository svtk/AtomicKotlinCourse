## Base Class Initialization (#2)

Create a global `private` `var trace` initialized to an empty `String`. In
every class in this exercise, add an `init` that appends the name of the class
and a newline to `trace`.

Create a class `Plate` and inherit `DinnerPlate` from it. Create a class
`Utensil` and inherit `Spoon`, `Fork` and `Knife` from it. Create a class
`Custom` (as in "a cultural tradition"), and inherit `PlaceSetting` from it.
Inside `PlaceSetting`, create properties containing `Spoon`, `Fork`, `Knife`
and `DinnerPlate`, in that order. Create an instance of `PlaceSetting` to see
the initialization order.

```kotlin
// BaseClassInit/BCIExercise2.kt
package baseclassinit
import atomictest.eq

private var trace = ""

open class Plate {
  init {
    trace += "Plate\n"
  }
}

class DinnerPlate : Plate() {
  init {
    trace += "DinnerPlate\n"
  }
}

open class Utensil {
  init {
    trace += "Utensil\n"
  }
}

class Spoon : Utensil() {
  init {
    trace += "Spoon\n"
  }
}

class Fork : Utensil() {
  init {
    trace += "Fork\n"
  }
}

class Knife : Utensil() {
  init {
    trace += "Knife\n"
  }
}

open class Custom() {
  init {
    trace += "Custom\n"
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    trace += "PlaceSetting\n"
  }
}

fun main() {
  PlaceSetting()
/* Fails because of the newlines -- can we fix this?
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
""".trim()
*/
}
```