## Abstract Classes (#1)

Create an `abstract class Shape` with two `abstract` methods, `draw()` and
`erase()`, each producing the default (`Unit`) return type. Inherit `Circle`,
`Square` and `Triangle` from `Shape`, and override the `abstract` methods to
call `println()` with `"Draw Circle"`, `"Erase Circle"`, etc. In `main()`,
create a `List` called `shapes` containing one of each subtype. Call `draw()`
for each object in the `List`, then `erase()` for each object in the `List`, to
match the exercise output.

> Solution

// Abstract/AbsExercise1.kt
package abstractClassesExercise1

abstract class Shape {
  abstract fun draw()
  abstract fun erase()
}

open class Circle : Shape() {
  override fun draw() =
    println("Draw Circle")
  override fun erase() =
    println("Erase Circle")
}

open class Square() : Shape() {
  override fun draw() =
    println("Draw Square")
  override fun erase() =
    println("Erase Square")
}

open class Triangle() : Shape() {
  override fun draw() =
    println("Draw Triangle")
  override fun erase() =
    println("Erase Triangle")
}

fun main() {
  val shapes = listOf(
    Circle(),
    Square(),
    Triangle(),
  )
  shapes.forEach { it.draw() }
  shapes.forEach { it.erase() }
}
/* Example Output:
Draw Circle
Draw Square
Draw Triangle
Erase Circle
Erase Square
Erase Triangle
*/