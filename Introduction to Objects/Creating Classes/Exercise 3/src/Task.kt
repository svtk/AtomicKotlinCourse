package creatingClasses.exercise3

class Robot {
  fun goRight(steps: Int) {
    println("Right $steps steps")
  }

  fun goLeft(steps: Int) {
    println("Left $steps steps")
  }

  fun goDown(steps: Int) {
    println("Down $steps steps")
  }

  fun goUp(steps: Int) {
    println("Up $steps steps")
  }
}

/*
fun main() {
  val robot = Robot()
  robot.goUp(11)
}
 */
/* Output:
going up 11 steps
*/