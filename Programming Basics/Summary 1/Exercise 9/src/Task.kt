package summary9

fun everyFifthNonWhitespace(s: String) {
  var i = 1
  for (c in s) {
    if (i % 5 == 0 && c != ' ') {
      println(c)
    }
    if (c != ' ') i++
  }
}

fun main() {
  everyFifthNonWhitespace("abc d e fgh ik")
}
/* Expected output:
e
k
*/