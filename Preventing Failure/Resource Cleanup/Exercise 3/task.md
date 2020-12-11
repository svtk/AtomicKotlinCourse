## Resource Cleanup (#3)

The goal of this exercise is to verify that, regardless of the way your code
exits a `use()` block, the `close()` function is always called. Reuse the
`Cleanup` class you created in Exercise 2, which is included in the starter
code, along with an `enum class Option { Normal, Return, Throw }`.

Define a function `verifyClose(opt: Option)`. `verifyClose()` creates a
`Cleanup` object and invokes `use()` on it. The lambda for `use()` contains a
`when` expression that implements these rules. When `opt` is:

- `Normal`: `f()` is called, then `g()` (inside the `when` expression), then
  `h()`, before leaving the `use()` block.

- `Return`: `f()` is called and then `return`. This exits the middle of the
  `use()` block.

- `Throw`: `f()` is called and then an `Exception` is thrown from the middle of
  the `use()` block.

`main()` tests your code.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
