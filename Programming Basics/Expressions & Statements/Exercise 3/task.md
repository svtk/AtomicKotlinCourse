## Expressions & Statements (#3)

Guess what the following code will print and then check yourself:

```kotlin
var i = 1
println(i-- - --i)
```

Open 'hint' to see the explanation.

<div class="hint">

This code can be rewritten as:

```kotlin
// i-- means: 
// first the current value is return,
// then the value is decremented
val left = i // i: 1, left: 1
i -= 1 // i: 0

// --i means:
// first the value is decremented,
// then the current value is return 
i -= 1 // i: -1
val right = i // i: -1, right: -1

val result = left - right // 1 - (-1) = 1 + 1 = 2
println(result)
```

</div>