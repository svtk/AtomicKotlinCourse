// ImportanceOfLambdas/StoringLambda.kt
import atomictest.eq

fun main() {
  val list = listOf(1, 2, 3, 4)
  val isEven = { e: Int -> e % 2 == 0 }
  list.filter(isEven) eq listOf(2, 4)
  list.any(isEven) eq true
}