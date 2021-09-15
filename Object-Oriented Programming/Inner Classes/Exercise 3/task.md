## Inner Classes (#3)

Define a `class Container<T>(iterable: Iterable<T>)` with a property `items`
which is a `MutableList<T>`. Initialize `items` using `iterable` as its data
source. Include a function `add(x: T)` that adds an element to `items`. Define
a member function `selector()` that returns an object of an anonymous inner
class that implements:

```kotlin
interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}
```

- `end()` tells whether you're at the end of the `items` `List`

- `current()` returns the current element pointed to by the `Selector`

- `next()` moves to the next element in the `List`.

Define a standalone function `<T> traceAll(select: Selector<T>)` that uses
`select` to append all the values of `current()` to `trace`, then
returns `trace`.

Now make `Container` inherit from `Iterable<T>`, and add a function called
`iterator()` that returns an instance of an anonymous inner class that inherits
from `Iterator<T>`. Add a standalone function `<T> traceAll2(ib: Iterable<T>)`
that produces the same behavior as `traceAll()`.

The starter code contains a `main()` with tests to verify your code.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
