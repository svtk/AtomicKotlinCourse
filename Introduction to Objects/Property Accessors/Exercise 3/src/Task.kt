package propertyAccessorsExercise3

class GS {
  private var i: Int = 0
    get() {
      println("get()")
      return field         // [1]
    }
    set(value) {
      println("set($value)")
      field = value        // [2]
    }
  fun change(n: Int) {
    i = n
  }

  override fun toString(): String = "$i"
}

fun main() {
  val d = GS()
  d.change(2)
  println(d)
}
/* Output:
set(2)
get()
2
*/