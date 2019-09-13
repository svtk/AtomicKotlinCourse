## Constraining Visibility (#3)

A `Robot` can only move forward. Check that the `steps` argument is a positive
number. For `right()`, `left()`, `down()` and `up()`, a negative or zero
`steps` argument should not update the location. Instead it should produce
console output:

```
"Incorrect steps argument: $steps; must be positive."
```

In `main()`, test the steps using positive, negative and zero values of
`steps`.