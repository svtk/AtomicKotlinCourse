// NothingType/ListOfNothing.kt
import atomictest.eq

fun main() {
  val none: Nothing? = null

  var nullableString: String? = null    // [1]
  nullableString = "abc"
  nullableString eq "abc"
  nullableString = none
  nullableString eq null

  val nullableInt: Int? = none
  nullableInt eq null

  val listNone: List<Nothing?> = listOf(null)
  val ints: List<Int?> = listOf(null)   // [4]
  ints eq listNone
}