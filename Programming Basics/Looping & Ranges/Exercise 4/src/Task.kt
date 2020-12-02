// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun printHalfPyramid(n: Int) {
  for (i in 1..n) {
    repeat(i) {
      print("#")
    }
    println()
  }
}

fun main() {
  printHalfPyramid(4)
}
/* Output:
#
##
###
####
*/