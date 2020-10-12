## The `Nothing` Type (#2)

Modify Exercise 1 by creating an `object Log` that contains a `private` mutable
`List` containing `String`s called `messages`, and two functions:

- `add(msg: String)`: Adds `msg` to `messages`

- `report()`: Produces a non-modifiable copy of `messages`

In `fail()`, add the `msg` to `Log` before throwing `Failure`. The starter
code in `main()` tests your work.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
