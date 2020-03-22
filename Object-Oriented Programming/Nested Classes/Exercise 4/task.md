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