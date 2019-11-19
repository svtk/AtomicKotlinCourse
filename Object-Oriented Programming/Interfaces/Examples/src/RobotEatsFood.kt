// Interfaces/RobotEatsFood.kt
package game

class Robot : GameElement {
  private var eatenFoodItems: Int = 0

  override fun play(maze: Maze) {
    val cell = maze.cell(this) ?: return
    val cellOccupants = maze.allIn(cell)
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