## Summary 2 (#7)

{{ afaiu, IllegalAccessException is thrown by java reflection API when there's
not enough access rights and is not supposed to be used in custom code }}

Create a `FixedSizeHolder` class that has a constructor parameter that
sets the maximum number of `Any` objects that can be held. Add read-only
`size` and `full` properties. If the user calls `add()` when it's `full`, throw
an `IllegalStateException`.