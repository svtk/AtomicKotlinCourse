## Property Delegation (#3)

Start with:

```kotlin
class Delegator {
  private var list = List(8) { "$it" }
  var strings by list
}
```

Define `getValue()` and `setValue()` as extension functions to `List<String>`.
The code in `main()` will test your solution.

BONUS: Try adjusting `getValue()` and `setValue()` to work with:

```kotlin
class Delegator {
  var strings by List(8) { "$it" }
  ...
```

And explain what happens.

<div class="hint">

IntelliJ IDEA will generate skeletons for you.

</div>

<sub> This task doesn't contain automatic tests, so
it's always marked as "Correct" when you run "Check".
Please compare your solution to the one provided! </sub>
