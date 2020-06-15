## Base Class Initialization (#2)

Define classes describing a dinner place setting. In each class, add an `init`
section that calls `println()`, passing it the name of the class.

- `Plate`
- `DinnerPlate` inherits `Plate`
- `Utensil`
- `Spoon`, `Fork` and `Knife` all inherit `Utensil`
- `Custom` (as in "a cultural tradition")
- `PlaceSetting` inherits `Custom`

Inside `PlaceSetting`, create properties of type `Spoon`, `Fork`, `Knife` and
`DinnerPlate`, in that order. In `main()`, create an instance of `PlaceSetting`
to show the initialization order.

> Solution

```kotlin
// BaseClassInit/BCIExercise2.kt
package baseClassInitializationExercise2

open class Plate {
  init {
    println("Plate")
  }
}

class DinnerPlate : Plate() {
  init {
    println("DinnerPlate")
  }
}

open class Utensil {
  init {
    println("Utensil")
  }
}

class Spoon : Utensil() {
  init {
    println("Spoon")
  }
}

class Fork : Utensil() {
  init {
    println("Fork")
  }
}

class Knife : Utensil() {
  init {
    println("Knife")
  }
}

open class Custom() {
  init {
    println("Custom")
  }
}

class PlaceSetting : Custom() {
  val spoon = Spoon()
  val fork = Fork()
  val knife = Knife()
  val plate = DinnerPlate()
  init {
    println("PlaceSetting")
  }
}

fun main() {
  PlaceSetting()
}
/* Exercise Output:
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
*/
```