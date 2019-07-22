package constrainingVisibility2

class Robot(
    private val fieldSize: Int,
    private var x: Int,
    private var y: Int
) {
  private fun crossBoundary(coordinate: Int): Int {
    val inBounds = coordinate % fieldSize
    return if (inBounds < 0) {
      fieldSize + inBounds
    } else {
      inBounds
    }
  }

  private fun checkSteps(steps: Int): Boolean {
    if (steps <= 0) {
      println("Incorrect input: $steps, the number of steps should be positive.")
      return true
    }
    return false
  }

  fun goRight(steps: Int) {
    if (checkSteps(steps)) return
    x += steps
    x = crossBoundary(x)
  }

  fun goLeft(steps: Int) {
    if (checkSteps(steps)) return
    x -= steps
    x = crossBoundary(x)
  }

  fun goDown(steps: Int) {
    if (checkSteps(steps)) return
    y += steps
    y = crossBoundary(y)
  }

  fun goUp(steps: Int) {
    if (checkSteps(steps)) return
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"

  override fun toString() = "Robot(x=$x,y = $y)"
}

fun main() {
    val robot = Robot(10, 1, 1)
    robot.goRight(-1)
}
/* Output:
Incorrect input: -1, the number of steps should be positive.
*/