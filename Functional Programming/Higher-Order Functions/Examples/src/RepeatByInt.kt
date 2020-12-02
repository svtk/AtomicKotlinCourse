// HigherOrderFunctions/RepeatByInt.kt
import atomictest.*

fun main() {
  repeat(2) { trace("hi!") }
  trace eq "hi! hi!"
}