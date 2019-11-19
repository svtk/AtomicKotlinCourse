package abstractClassesExercise1

fun Maze.isPassable(cell: Cell): Boolean {
  if (cell.x !in (0 until width) || cell.y !in (0 until height)) {
    return false
  }
  val cellOccupants = allIn(cell)
  return cellOccupants.all { it.sharesCell }
}

fun Cell.applyMove(move: Move): Cell =
  when (move) {
    Move.WAIT -> Cell(x, y)
    Move.UP -> Cell(x, y - 1)
    Move.DOWN -> Cell(x, y + 1)
    Move.RIGHT -> Cell(x + 1, y)
    Move.LEFT -> Cell(x - 1, y)
  }