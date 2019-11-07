## Exceptions (#1)

Write a function `unConvertible(s: String)` that attempts to convert `s` to a
`Double`. If the conversion succeeds, it returns an empty `String`. If the
conversion fails, the function captures the exception and produces `s` as the
return value. Test your function with the following `String`s:

```
"12", "1.2", "1,2", "1.2e0", "1.2e1", "1.2e2", "1.2e3", "1.2e10", "12.3e10",
"1.2e-1", "1.2e-10".
```