// OperatorOverloading/OpOverloadingSoln1.kt
package operatorOverloadingExercise1
import atomictest.*

class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
  init {
    require(current in range) {
      "'current' out of range: $current"
    }
  }
  override fun toString() = "$current"
  operator fun inc(): WrapRange {
    current = if (current == range.last) range.first else current + 1
    return this
  }
  operator fun dec(): WrapRange {
    current = if (current == range.first) range.last else current - 1
    return this
  }
}

fun main() {
  val range = 2..5
  var wr = WrapRange(range)
  fun testUp() =
    trace("${wr}, ${wr++}")
  fun testDown() =
    trace("${wr}, ${wr--}")
  range.forEach { testUp() }
  trace("-----------")
  range.forEach { testDown() }
  capture { WrapRange(range, 6) } eq
    "IllegalArgumentException: " +
    "'current' out of range: 6"
  capture { WrapRange(range, -1) } eq
    "IllegalArgumentException: " +
    "'current' out of range: -1"
  trace eq """
    2, 3
    3, 4
    4, 5
    5, 2
    -----------
    2, 5
    5, 4
    4, 3
    3, 2
  """
}