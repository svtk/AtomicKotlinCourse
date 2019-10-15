package breakAndContinue.exercise2

fun main() {
  label1@ for (i in 6 downTo 0) {
    if (i == 4) continue@label1
    if (i == 2) break@label1
  }
}