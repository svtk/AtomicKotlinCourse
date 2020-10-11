## Number Types (#4)

Write a function that produces the time in milliseconds given a period of time
in hours, minutes and seconds. (One second is a thousand milliseconds). For
example, an hour and a half is `5_400_000` milliseconds.

<div class="hint">

Make sure you store all intermediate computations in a `Long`, otherwise
you can produce incorrect results. For example, if you convert one billion
hours to milliseconds but don't store those milliseconds in a `Long`, you'll
get an overflow:

```kotlin
// Int computation causes integer overflow:
1_000_000_000 * 60 = -129542144
// Long computation succeeds:
1_000_000_000 * 60L = 60000000000L
```

</div>
