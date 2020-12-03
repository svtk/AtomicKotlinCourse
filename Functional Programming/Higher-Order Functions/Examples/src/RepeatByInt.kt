// HigherOrderFunctions/RepeatByInt.kt
import atomictest.*

fun main() {
  repeat(4) { trace("hi!") }
  trace eq "hi! hi! hi! hi!"
}