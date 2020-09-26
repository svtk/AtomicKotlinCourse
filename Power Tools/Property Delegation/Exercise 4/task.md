## Property Delegation (#4)

Create a generic class that begins:

```kotlin
class Holder<E> {
  private var list = listOf<E>()
```

Define `getValue()` and `setValue()` for `Holder`, so that you can successfully
write:

```kotlin
class Holders {
  var strings by Holder<String>()
  var ints by Holder<Int>()
  var bools by Holder<Boolean>()
}
```

The starter code in `main()` will test your solution.