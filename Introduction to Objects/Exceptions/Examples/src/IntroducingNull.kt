// Exceptions/IntroducingNull.kt
package exceptions
import atomictest.eq

fun main() {
  "1$".toIntOrNull() eq null
}