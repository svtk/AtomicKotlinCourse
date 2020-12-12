## Check Instructions (#4)

Create a `class Tank(val capacity: Double)`, where `capacity` is the maximum
amount the `Tank` can hold. Add a `safetyGap` property that calculates a 2% gap
of empty space that must be preserved at the top of the `Tank`. The current
amount in the `Tank` is held in a read-only property called `level`. The actual
allowable amount the tank can hold is `maxLevel`.

Define two member functions for `Tank`:

- `add(quantity: Double): Double`, where `quantity` must be positive. Only add
  enough of the `quantity` to fill the tank up to `maxLevel` and put the rest in
  `remainder`. At the end of the function check that `level` is greater than
  zero, that `level` is less than or equal to `maxLevel`, and that `remainder`
  is greater than or equal to zero. Then return `remainder`.

- `drain(quantity: Double)`, where `quantity` must be positive and cannot exceed
  the `level` in the `Tank`. After removing `quantity` from the tank, check that
  the `level` is greater than or equal to zero.

The starter code in `main()` tests your `Tank` class and shows what error
messages to use in your `require()` and `check()` calls.

Notice that the calls to `check()` do not fail as long as the internal function
logic is correct. That is, if a `check()` throws an exception, it indicates a
programming error. For this reason, `check()` calls may be removed once the code
is verified, to improve performance. It is best to leave them in to maintain
code verification, but if that isn't possible you can convert the `check()`
tests into unit tests (see [Unit Testing]).

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
