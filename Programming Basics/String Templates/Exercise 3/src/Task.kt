package stringTemplates3

fun show(i: Int, s: String, c: Char, d: Double) {
  println("i: $i")
  println("""s: "$s"""")
  println("c: '$c'")
  println("d: $d")
}

fun main() {
  show(1, "abc", 'd', 2.0)
}
/* Expected output:
i: 1
s: "abc"
c: 'd'
d: 2.0
*/