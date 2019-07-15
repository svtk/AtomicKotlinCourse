## `var` & `val` (#2)

Declare two `var`s: `x` and `y`. Swap their contents (you can first try saying
`x = y`, `y = x` and then fix the erroneous solution):

```kotlin
var x = 1
var y = 2
// swap
println(x) // 2
println(y) // 1
```

Your code should remain unchanged for different initializers, like `var x =
"first"`, `var y = "second"`. Thus saying just `x = 2`, `y = 1` is not the
expected solution.

HINT: You may need to introduce a third auxiliary `val`.