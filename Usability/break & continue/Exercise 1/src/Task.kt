package breakAndContinue1

fun trace(id: Int) {
  println(id)
}

fun main() {
  trace(1)
  while (true) {
    trace(2)
    break
  }
  trace(3)
}