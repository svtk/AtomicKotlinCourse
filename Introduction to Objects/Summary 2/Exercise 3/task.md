## Summary 2 (#3)

Create a `FixedSizeHolder` class with a constructor parameter that sets the
maximum number of `Any` objects that can be held. Add read-only `size` and
`full` properties. If the user calls `add()` when it's `full`, throw an
`IllegalStateException`.
