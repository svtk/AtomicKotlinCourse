// Interfaces/RobotEatsFood.kt
package game

class Robot : GameElement {
  private var eatenFoodItems: Int = 0

  override fun play(maze: Maze) {
    val position =
      maze.position(this) ?: return
    val cellOccupants = maze.allAt(position)
    cellOccupants
      .filterIsInstance<Food>()
      .forEach { food ->
        eatenFoodItems++
        maze.remove(food)
      }
  }
}

class Food : GameElement {
  override fun play(maze: Maze) {
    // Food is passive
  }
}