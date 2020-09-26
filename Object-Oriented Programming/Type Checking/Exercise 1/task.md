## Type Checking (#1)

Modify `TypeCheck3.kt` by moving `rotate()` into `Shape` and returning `Shape`
to an `interface`. Notice how `turn()` becomes much cleaner.

> Solution 1

```kotlin
// TypeChecking/TypeCheckingSoln1.kt
package typecheckingsoln1
import atomictest.eq
import typechecking.name

interface Shape {
  fun draw() = "${this.name}: Draw"
  fun rotate() = ""
}

class Circle : Shape

class Square : Shape {
  override fun rotate() = "Square: Rotate"
}

class Triangle : Shape {
  override fun rotate() = "Triangle: Rotate"
}

fun turn(s: Shape) = s.rotate()

fun main() {
  val shapes = listOf(Circle(), Square())
  shapes.map { it.draw() } eq
    "[Circle: Draw, Square: Draw]"
  shapes.map { turn(it) } eq
    "[, Square: Rotate]"
}
```