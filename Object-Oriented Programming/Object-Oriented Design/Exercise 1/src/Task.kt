package objectOrientedDesignExercise1

/*
// Add the following to `Actors.kt`:

class Bomb(
  override val room: Room = Room()
) : Actor() {
  override val symbol = '*'
  override fun makeActor(r: Room) = Bomb(r)
  override fun interact(robot: Robot): Room {
    robot.energy = 0 // Bomb erases energy
    room.actor = Empty(room)
    return room
  }
}
 */