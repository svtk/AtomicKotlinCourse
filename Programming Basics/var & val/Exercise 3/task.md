## `var` & `val` (#3)

Define two `var`s: `x` and `y`. Swap their contents. First try `x = y`, `y =
x`, then fix the erroneous solution:

```kotlin
var x = 1
var y = 2
// Perform swap here
println(x) // 2
println(y) // 1
```

Your code should remain unchanged for different initializers, like `var x =
"first"`, `var y = "second"`. Thus, using `x = 2`, `y = 1` is not the expected
solution.

<div class="hint">

You may need to introduce a third auxiliary `val`.

</div>
