## Complex Constructors (#1)

Modify `Alien` by making `name` `private`, then giving it a constructor that
assigns its `name` to the `val` property `myName`.

```kotlin
// ComplexConstructors/Exercise1.kt
package complexconstructors
import atomictest.eq

class Alien2(private val name: String) {
  val myName: String
  init {
    myName = name
  }
}

fun main() {
  val alien = Alien2("Pencilvester")
  alien.myName eq "Pencilvester"
}
```