package propertiesExercise3

class Robot {
  var x = 0
  var y = 0
  val fieldSize = 100

  fun crossBoundary(coordinate: Int): Int {
    val inBounds = coordinate % fieldSize
    return if (inBounds < 0) {
      fieldSize + inBounds
    } else {
      inBounds
    }
  }

  fun goRight(steps: Int) {
    x += steps
    x = crossBoundary(x)
  }

  fun goLeft(steps: Int) {
    x -= steps
    x = crossBoundary(x)
  }

  fun goDown(steps: Int) {
    y += steps
    y = crossBoundary(y)
  }

  fun goUp(steps: Int) {
    y -= steps
    y = crossBoundary(y)
  }

  fun getLocation(): String = "($x, $y)"
}

fun main() {
  val robot = Robot()
  println(robot.getLocation())
  robot.goUp(1)
  println(robot.getLocation())
  robot.goLeft(10)
  println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/