// NonNullAssertions/ValueFromMap.kt
import atomictest.*

fun main() {
  val map = mapOf(1 to "one")
  map[1]!!.uppercase() eq "ONE"
  map.getValue(1).uppercase() eq "ONE"
  capture {
    map[2]!!.uppercase()
  } eq "NullPointerException"
  capture {
    map.getValue(2).uppercase()
  } eq "NoSuchElementException: " +
    "Key 2 is missing in the map."
}