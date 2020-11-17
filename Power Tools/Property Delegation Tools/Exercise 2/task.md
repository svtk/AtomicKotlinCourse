## Property Delegation Tools (#2)

The starter code defines a `data class` called `Flag` containing a `Boolean`
called `b` with a default value of `false`. In `main()`, create three `var`s:
`d` of type `Double`, `s` of type `String` and `f` of type `Flag`, all delegated
to `notNull()`. For `d` and `f`, use explicit type declarations but for `s` use
a type parameter for `notNull()`.

Using `capture` from `atomictest`, try reading from `d`, `s` and `f` before
they are initialized and validate the output using `atomictest.eq`. Then set
`d` to `1.1`, `s` to `"yes"` and `f` to `Flag(true)` and use `eq` to verify
that they all take on the new values.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
