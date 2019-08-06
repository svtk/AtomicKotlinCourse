// Composition/MazeComposition.kt
package prefercomposition

interface Element
interface Move
data class Position(val x: Int, val y: Int)

interface Maze {
  fun all(): Set<Element>
  fun allAt(position: Position): Set<Element>
  fun position(element: Element): Position?
  fun add(element: Element, position: Position)
  fun remove(element: Element)
}

interface Game {
  val maze: Maze
  fun playMove(move: Move)
  fun playTurn()
  fun gameOver(): Boolean
  fun hasWon(): Boolean
  fun score(): Int
}