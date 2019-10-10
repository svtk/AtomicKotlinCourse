## Summary 1 (#4)

Write a function `first()` that has an *expression body* starting with `if`.
`first()` takes three `Boolean` arguments and "ands" them together to produce
the result. Write `second()` to do the same but "or" all three arguments. In
`main()`, display the result of combining `first()` and `second()` using both
"and" and "or":

| `first()` Arguments | `second()` Arguments |
|---------------------|----------------------|
| true, true, true    | false, false, false  |
| true, false, true   | false, true, false   |