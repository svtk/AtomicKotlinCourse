## Booleans (#2)

Create a "truth table" for `&&` and `||`. Write a function `showAnd(first:
Boolean, second: Boolean)` that uses a `String` template to show `first`, the
`&&` symbol, `second`, `==` symbol, and then the result of `first && second`.
Write a similar function for `showOr()`.

The sample output for `showAnd(true, true)` should be:

```
true && true == true
```

Then write a function `showTruthTable` that should display a table produced by
all possible combinations of `true` and `false` for both `showAnd()` and
`showOr()`. Make sure you include all possible ordering.