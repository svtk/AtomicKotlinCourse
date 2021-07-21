## Constraining Visibility (#3)

A `Robot` can only move forward. Check that the `steps` argument is a positive
number. For `right()`, `left()`, `down()` and `up()`, a negative or zero
`steps` argument should not update the location. Instead it should produce
console output using this `String`:

```text
"steps argument must be positive, is $steps"
```

In `main()`, test your code using positive, negative and zero values of
`steps`.
