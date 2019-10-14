package breakAndContinue3

fun main() {
  label2@ for (i in 6 downTo 0) {
    label1@ for (j in 6 downTo 0) {
      if (i == 4) continue@label1
      if (i == 2) break@label1

      if (j == 1) break@label2
    }
  }
}