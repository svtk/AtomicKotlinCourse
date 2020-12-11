## Logging (#1)

The starter code includes `class Level`, which is the solution of Exercise 3
from [Check Instructions].

Create a class called `Pipe` that takes `val level: Level` as a constructor
parameter. Give this parameter a default argument with a range `0..10`.

Inside `Pipe`, define a `val logger` using `atomiclog` with an associated file
`"PipeLog.txt"`. Create a member function `checkLevel()` that uses a `when`
expression. When `value` is:

- 2: call `trace()`
- 4: call `debug()`
- 6: call `info()`
- 8: call `warn()`
- 10: call `error()`

The log message for each call is just "Level " followed by the matched value.
The starter code in `main()` tests your solution.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
