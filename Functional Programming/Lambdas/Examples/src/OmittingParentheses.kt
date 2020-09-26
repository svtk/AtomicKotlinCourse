// Lambdas/OmittingParentheses.kt
package lambdas
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c', 'd')
  val result = list.map { "[$it]" }
  result eq
    listOf("[a]", "[b]", "[c]", "[d]")
}