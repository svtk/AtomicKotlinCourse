package constructors1

class Floating(val d: Double) {
  override fun toString(): String = d.toString()
}

fun main() {
  val floating = Floating(2.0)
  println(floating)
}