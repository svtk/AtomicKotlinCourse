## Variable Argument Lists (#2)

Write a function `printArgs()` with a `String` as the first parameter, and a
`vararg` parameter of `Int` as the second parameter. `printArgs()` displays its
arguments to the console: first the `String`, then the `Int`s, separated by
commas and surrounded by square brackets.

For example, the output for `printArgs("Numbers: ", 1, 2, 3)` should be:

```text
Numbers: [1, 2, 3]
```

<div class="hint">

Use `toList()` on the `vararg` parameter to get the requested `String`
representation.

</div>
