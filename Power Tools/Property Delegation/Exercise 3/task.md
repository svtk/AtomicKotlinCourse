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