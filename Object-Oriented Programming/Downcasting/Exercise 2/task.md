## Downcasting (#2)

Modify `FindType.kt` to use `filterIsInstance()`. First find all `Dog` objects,
then map each of the resulting objects onto `bark()` and test the result using
`atomictest.eq`. Notice that `filterIsInstance()` produces a sequence of
already-downcast `Dog` objects.

There's a second, more dynamic form of `filterIsInstance()`, which takes a
*class object* as a parameter. Pass `Dog::class.java` as the argument to
`filterIsInstance()`, with the rest of the expression as described in the
previous paragraph. How is this version of `filterIsInstance()` different from
the version that uses a generic argument?

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
