## Inner Classes (#3)

Define a `class Container<T>(iterable: Iterable<T>)` with a property `items`
which is a `MutableList<T>`. Initialize `items` using `iterable` as its data
source. Include a function `add(x: T)` that adds an element to `items`. Define
a member function `selector()` which returns an object of an anonymous inner
class that implements:

```kotlin
interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}
```

`end()` tells whether you're at the end of the `items` `List`, `current()`
returns the current element pointed to by the `Selector`, and `next()` moves
to the next element in the `List`.

Define a standalone function `<T> traceAll(select: Selector<T>)` that creates a
`Trace` object called `trace`, then uses `select` to append all the values of
`current()` to `trace` using `+=`, then returns `trace`.

Now make `Container` inherit from `Iterable<T>`, and add a function called
`iterator()` that returns an instance of an anonymous inner class that inherits
from `Iterator<T>`. Add a standalone function `<T> traceAll2(ib: Iterable<T>)`
that produces the same behavior as `traceAll()`.

The starter code contains a `main()` with tests to verify your code.

```kotlin
// InnerClasses/InnerEx3.kt
package innerclassesex3
import atomictest.*

interface Selector<T> {
  fun end(): Boolean
  fun current(): T
  fun next()
}

class Container<T>(
  iterable: Iterable<T>
) : Iterable<T> {
  private val items = iterable.toMutableList()
  fun add(x: T) = items.add(x)
  fun selector() = object : Selector<T> {
    private var i = 0
    override fun end() = i == items.size
    override fun current() = items[i]
    override fun next() {
      if (i < items.size) i++
    }
  }
  override
  fun iterator() = object : Iterator<T> {
    private var i = 0
    override fun hasNext() = i < items.size
    override fun next(): T = items[i++]
  }
}

fun <T> traceAll(select: Selector<T>): Trace {
  val trace = Trace()
  while (!select.end()) {
    trace += "${select.current()}"
    select.next()
  }
  return trace
}

fun <T> traceAll2(ib: Iterable<T>): Trace {
  val trace = Trace()
  val iter = ib.iterator()
  while (iter.hasNext())
    trace += "${iter.next()}"
  return trace
}

fun main() {
  traceAll(Container(0..9).selector()) eq
    "0 1 2 3 4 5 6 7 8 9"
  traceAll2(Container(0..9)) eq
    "0 1 2 3 4 5 6 7 8 9"
  traceAll(Container(List(10){ it * it })
    .selector()) eq
    "0 1 4 9 16 25 36 49 64 81"
  traceAll2(Container(List(10){ it * it })) eq
    "0 1 4 9 16 25 36 49 64 81"
}
```