## Number Types (#4)

Write a function that produces the time in milliseconds given a period of time
in hours, minutes and seconds. (One second is a thousand milliseconds). For
instance, one hour and a half is `5_400_000` milliseconds.

<div class="hint">

Mare sure you store all the intermediate computations in `Long`,
otherwise you can get an incorrect result.
For instance, if you convert one billion hours to milliseconds
and don't store milliseconds in `Long`, you'll get overflow:

```kotlin
// computation in Int ends with integer overflow:
1_000_000_000 * 60 = -129542144
// computation in Long works correctly:  
1_000_000_000 * 60L = 60000000000L
```

</div>