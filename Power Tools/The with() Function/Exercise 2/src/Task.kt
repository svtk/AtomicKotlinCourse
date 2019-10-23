package theWithFunctionExercise2

import atomictest.eq

class Window(
  val id: String,
  var x: Int = 0,
  var y: Int = 0,
  var width: Int = 200,
  var height: Int = 100
)

fun <T, R> with2(receiver: T, block: (T) -> R): R {
  return block(receiver)
}

fun adjustWindow(window: Window) {
  with2(window) {
    it.x = 10
    it.y = 10
    it.width *= 2
    it.height *= 2
  }
}

fun main() {
  val window = Window("my")
  adjustWindow(window)
  window.x eq 10
  window.width eq 400
}