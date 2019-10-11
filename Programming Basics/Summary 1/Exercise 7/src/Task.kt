package summary7

fun testCondition(i: Int) = i < 100

fun main() {
  var i = 0
  while (i++ < 100) {
    if (i % 10 == 0) {
      print(".")
    }
  }
}
/* Expected output:
..........
*/