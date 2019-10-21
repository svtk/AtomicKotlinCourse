## Variable Argument Lists (#2)

Write a function `printArgs()` with a `String` as the first parameter, and a
`vararg` parameter of `Int` as the second parameter. `printArgs` should display
its arguments to the console; first string, then integer numbers, separated by
comma and surrounded by square brackets.

For example, the output for `printArgs("Numbers: ", 1, 2, 3)` should be:

```
Numbers: [1, 2, 3]
```

<div class="hint">

Use `toList` conversion on `vararg` parameter to get the requested
string representation.

</div>