// ScopeFunctions/AndNullability.kt
package scopefunctions
import atomictest.eq
import kotlin.random.Random

fun gets(): String? =
  if (Random.nextBoolean()) "str!" else null

fun main() {
  gets()?.let {
    it.removeSuffix("!") + it.length
  }?.eq("str4")
}