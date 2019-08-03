package creatingClasses1

class Robot {
  fun goRight(steps: Int) {
    println("going right $steps steps")
  }

  fun goLeft(steps: Int) {
    println("going left $steps steps")
  }

  fun goDown(steps: Int) {
    println("going down $steps steps")
  }

  fun goUp(steps: Int) {
    println("going up $steps steps")
  }
}

fun main() {
  /*
  val robot = Robot()
  robot.goUp(11)
   */
}
/* Output:
going up 11 steps
*/