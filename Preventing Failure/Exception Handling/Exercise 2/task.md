## Exception Handling (#2)

The starter code defines an exception hierarchy and three functions:

- `findNumber(s: String)` searches `s` and returns a `String` containing a
  number. It throws `NoNumber` if no number is found.

- `convertNumber(s: String)` converts `s` to an `Int`. It throws `BadNumber` if
  `s` cannot be converted to an `Int`.

- `embedNumber(n: Int)` produces a `String` containing `n` within some letters.

Your job is to define two functions:

- `justFail(s: String)` calls the above three functions, nesting calls within
  calls. It finds a number within a `String`, converts it to an `Int`, embeds
  that `Int` inside a `String`, and calls `trace()` with the result.

- `recover(s: String)` calls each of the above functions one at a time,
  recovering from any failures for each call so the next call can be successful.
  If `findNumber()` fails, the recovery produces the `String` `"0"`. If
  `convertNumber()` fails, the recovery produces `-1`. At the end of of
  `recover()`, call `trace()` with the result.

The remaining starter code tests the above two functions.

Notice the potential effects produced by exceptions:

1. If a function might produce one or more exceptions, calls to that function
   can be significantly more complicated.

2. The concept of recovery assumes that there's a *way* you can recover from a
   failed function call. Often, however, this is simply not true.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
