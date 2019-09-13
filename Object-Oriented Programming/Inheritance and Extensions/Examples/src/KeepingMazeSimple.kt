// InheritanceAndExtensions/KeepingMazeSimple.kt
package inheritanceandextensions

interface Maze {
  fun all(): Set<Element>
  fun allAt(position: Position): Set<Element>
  fun position(element: Element): Position?
  fun add(element: Element, position: Position)
  fun remove(element: Element)
}

fun Maze.sameCellElements(
  element: GameElement
): Set<GameElement> {
  val position = position(element)
    ?: return setOf()
  return allAt(position) - element
}

fun Maze.isPassable(position: Position): Boolean {
  if (position.x !in (0 until width)
    || position.y !in (0 until height)) {
    return false
  }
  val elementsAtNewPosition = allAt(position)
  return elementsAtNewPosition.all { it.sharesCell }
}