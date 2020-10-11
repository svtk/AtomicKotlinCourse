## Expressions & Statements (#3)

Guess what the following code will display and then check yourself using
Kotlin:

```kotlin
var i = 1
println(i-- - --i)
```

Open the hint in IntelliJ IDEA to see the explanation.

<div class="hint">

This code can be rewritten as:

```kotlin
// i-- means:
// First the current value is produced,
// then the value is decremented.
val left = i // i: 1, left: 1
i -= 1 // i: 0

// --i means:
// First the value is decremented,
// then the current value is produced.
i -= 1 // i: -1
val right = i // i: -1, right: -1

val result =
  left - right // 1 - (-1) = 1 + 1 = 2
println(result)
```

</div>
