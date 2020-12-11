## Check Instructions (#1)

Create a function `f(s: String): String`. Add `require()` calls that use the
following error strings (infer the tests from the strings):

- `"s must not be empty, is [$s]"`

- `"s must not be blank, is [$s]"`

- `"s must contain 3 parts separated by '-', is [$s]"`

If all `require()`s succeed, return `s`.

Create a function `g(d: Double): Double` that uses `require()` to ensure that
`d` is greater than zero and less than or equal to 10.0. Do not provide a custom
error message for `require()`. If the `require()` succeeds, return `d`.

The starter code in `main()` tests `f()` and `g()`.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
