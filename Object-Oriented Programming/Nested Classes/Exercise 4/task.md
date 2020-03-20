## Nested Classes (#4)

Improve the implementation of the *State* pattern in `Ticket.kt`. Change `Seat`
from an enumeration to a non-nested `abstract class`, with a nested subclass
for each `Seat` type. `Seat` contains `abstract` member functions for
`upgrade()` and `meal()`. `Seat` also contains a `toString()` that produces the
`simpleName` of the specific subclass.

`Ticket` now becomes a simple holder for a `Seat` object, along with
`upgrade()` and `meal()` functions which forward their actions to the `Seat`
object.

Bonus (Challenging): Why can't you use delegation for `seat` in `Ticket`?

```kotlin
// NestedClasses/NestedEx4.kt
package nestedclassesex4
import atomictest.eq
import nestedclassesex4.Seat.*

abstract class Seat {
  abstract fun upgrade(): Seat
  abstract fun meal(): String
  override fun toString() =
    "${this::class.simpleName}"
  class Coach : Seat() {
    override fun upgrade() = Premium()
    override fun meal() = "Bag Meal"
  }
  class Premium : Seat() {
    override fun upgrade() = Business()
    override fun meal() = "Bag Meal + Cookie"
  }
  class Business : Seat() {
    override fun upgrade() = First()
    override fun meal() = "Hot Meal"
  }
  class First : Seat() {
    override fun upgrade() = First()
    override fun meal() = "Private Chef"
  }
}

class Ticket(
  private var seat: Seat = Coach()
) {
  fun upgrade(): Seat {
    seat = seat.upgrade()
    return seat
  }
  fun meal() = seat.meal()
  override fun toString() = "$seat"
}

fun main() {
  val tickets = listOf(
    Ticket(),
    Ticket(Premium()),
    Ticket(Business()),
    Ticket(First())
  )
  tickets.map(Ticket::meal) eq
    "[Bag Meal, Bag Meal + Cookie, " +
    "Hot Meal, Private Chef]"
  tickets.map(Ticket::upgrade) eq
    "[Premium, Business, First, First]"
  tickets eq
    "[Premium, Business, First, First]"
  tickets.map(Ticket::meal) eq
    "[Bag Meal + Cookie, Hot Meal, " +
    "Private Chef, Private Chef]"
}
```