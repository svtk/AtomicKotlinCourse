// Lambdas/ListIndicesMap.kt
package lambdas
import atomictest.eq

fun main() {
  val list = listOf('a', 'b', 'c')
  list.indices.map {
    "[$it]"
  } eq listOf("[0]", "[1]", "[2]")
}