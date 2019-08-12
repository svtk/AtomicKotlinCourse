// DesigningWithInheritance/GameElement.kt
package designingwithinheritance

interface GameAction

data class DestroyAction(
  val element: GameElement
) : GameAction

interface GameElement {
  fun playTurn(maze: Maze): Set<GameAction>
}