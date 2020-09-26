## Operator Overloading (#1)

Create a class that begins:

```kotlin
class WrapRange(
  val range: IntRange,
  private var current: Int = range.start
) {
```

Write member functions so that you can increment and decrement a `WrapRange`
object but `current` automatically stays within `range`.

Make any necessary modifications so the starter code in `main()` produces the
exercise output shown.