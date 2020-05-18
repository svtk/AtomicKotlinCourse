// Upcasting/UpcastExercise1.kt
package upcastingExercise1

interface Rodent {
  fun eat(): String
  fun speak(): String
}

class Mouse: Rodent {
  override fun eat() = "Mouse.eat"
  override fun speak() = "Mouse.speak"
}

class KangarooRat: Rodent {
  override fun eat() = "KangarooRat.eat"
  override fun speak() = "KangarooRat.speak"
  fun jump() = "KangarooRat.jump"
}

fun upcast(rodent: Rodent) {
  println(rodent.eat())
  println(rodent.speak())
//   rodent.jump() // Won't compile
}

fun main() {
  val mouse = Mouse()
  val kangarooRat = KangarooRat()
  println(kangarooRat.jump())
  upcast(mouse)
  upcast(kangarooRat)
}