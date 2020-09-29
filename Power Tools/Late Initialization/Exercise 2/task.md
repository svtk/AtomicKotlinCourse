## Late Initialization (#2)

Create a class `A` containing a `lateinit` `String` called `s`, and a function
`initialize()` that sets `s` to "Initialized" and returns `this`.

Create a class `B` that contains a property `a` that uses `lazy` initialization
to create and initialize an `A`. The code in `main()` tests your solution.

If `A` is the library someone else has created and that you are consuming,
`lazy` initialization can be a convenient way to configure its `lateinit`
properties.

<sub> This task doesn't contain the automatic tests,
it's always marked as "Correct" on "Check".
Please compare your solution with the provided one! </sub>