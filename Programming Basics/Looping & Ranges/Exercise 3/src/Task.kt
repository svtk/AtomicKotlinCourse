package loopingAndRanges3

fun sumOfEven(n: Int): Int {
  var result = 0
  for (i in 1..n) {
    if (i % 2 == 0) {
      result += i
    }
  }
  return result
}

fun main() {
  println(sumOfEven(10))  // 30
}