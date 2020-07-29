package abstractClassesExercise1

abstract class Shape {
  abstract fun draw()
  abstract fun erase()
}

open class Circle: Shape() {
  override fun draw() =
    println("Draw Circle")
  override fun erase() =
    println("Erase Circle")
}

open class Square: Shape() {
  override fun draw() =
    println("Draw Square")
  override fun erase() =
    println("Erase Square")
}

open class Triangle: Shape() {
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
/*
  shapes.forEach { it.draw() }
  shapes.forEach { it.erase() }
*/
}
/* Exercise Output:
Draw Circle
Draw Square
Draw Triangle
Erase Circle
Erase Square
Erase Triangle
*/