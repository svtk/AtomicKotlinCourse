## Object-Oriented Design (#1)

Add new type of `Actor` called `Bomb`, with `*` as its `symbol`. When it
encounters a `Bomb`, the `Robot` loses all its energy and the `Bomb` disappears
from the room (so the `Robot` still enters the room where the `Bomb` was). Add
one or more `*` to `stringMaze` to test your solution.

SOLUTION::

Add the following to `Actors.kt`:

```kotlin
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
```