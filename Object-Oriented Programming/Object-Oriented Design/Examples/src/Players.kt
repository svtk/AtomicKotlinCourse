// ObjectOrientedDesign/Players.kt
package oodesign

sealed class Player {
  abstract val symbol: Char
  open fun id() = symbol.toString()
  abstract val room: Room
  override fun toString() =
    "${this::class.simpleName} ${id()}"
  abstract fun interact(robot: Robot): Room
  // Makes the exact type of Player object:
  abstract fun makePlayer(r: Room): Player
  // Match the symbol and create + configure
  // a Room with the new Player, or Fail:
  open fun create(
    ch: Char, row: Int, col: Int): Result {
    if (ch == symbol) {
      val room = Room(row, col)
      room.player = makePlayer(room)
      return Result.Success(room)
    }
    return Result.Fail
  }
}
// To be continued ...