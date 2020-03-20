## Downcasting (#3)

Create an empty interface `Animal1`. Inherit a class `Worm1` with a member
function `wriggle()` that calls `trace("Wriggle")`. Inherit a class `Snail1`
with a member function `slide()` that calls `trace("Slide")`. Inherit a class
`Beetle1` with a member function `walk()` that calls `trace("Walk")`.

Write a function `move(a1: Animal1)` that uses a `when` to detect each type and
call that type's function. In `main()`, create a `List` of `Animal1` objects
and call `move()` for each one.

Create a duplicate hierarchy from an interface `Animal2`, but in this case make
`move()` a member of `Animal2` and implement it in `Worm2`, `Snail2`, and
`Beetle2`. In `main()`, create a `List` of `Animal2` objects and call `move()`
for each one.

Compare the type-checked hierarchy to the polymorphic hierarchy.

```kotlin
// DownCasting/DownCastEx3.kt
package downcastingex3
import atomictest.*

private val trace = Trace()

interface Animal1

class Worm1: Animal1 {
  fun wriggle() = trace("Wriggle")
}

class Snail1: Animal1 {
  fun slide() = trace("Slide")
}

class Beetle1: Animal1 {
  fun walk() = trace("Walk")
}

fun move(a1: Animal1) {
  when(a1) {
    is Worm1 -> a1.wriggle()
    is Snail1 -> a1.slide()
    is Beetle1 -> a1.walk()
  }
}

interface Animal2 {
  fun move()
}

class Worm2: Animal2 {
  override fun move() = trace("Wriggle")
}

class Snail2: Animal2 {
  override fun move() = trace("Slide")
}

class Beetle2: Animal2 {
  override fun move() = trace("Walk")
}

fun main() {
  val animals1 =
    listOf(Worm1(), Snail1(), Beetle1())
  animals1.forEach { move(it) }
  val animals2 =
    listOf(Worm2(), Snail2(), Beetle2())
  animals2.forEach { it.move() }
  trace eq """
  Wriggle
  Slide
  Walk
  Wriggle
  Slide
  Walk
  """
}
```