## Property Delegation (#3)

Start with:

```kotlin
class Delegator {
  private var list = List(8) { "$it" }
  var strings by list
}
```

Define `getValue()` and `setValue()` as extension functions to `List<String>`
(Hint: IntelliJ IDEA will generate skeletons for you). The code in `main()`
will test your solution.

BONUS: Try adjusting `getValue()` and `setValue()` to work with:

```kotlin
class Delegator {
  var strings by List(8) { "$it" }
  ...
```

And explain what happens.

<sub> This task doesn't contain the automatic tests,
it's always marked as "Correct" on "Check".
Please compare your solution with the provided one! </sub>