## Expressions & Statements (#3)

{{ :UNTESTABLE To use 'g' from the testing system, we need to import it, but imports are
covered only later. Thus we need to avoid using 'g' here }}

Write a function `n()` which multiplies its two `Int` parameters and returns
the result. Combine it with `g()` as follows:

```kotlin
val r = n(n(g(1, 1), g(2, 2)), g(3, 3))
```