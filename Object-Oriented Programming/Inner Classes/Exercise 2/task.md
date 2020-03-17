## Inner Classes (#2)

Although an inner class contains a reference to the outer-class object that
creates it, the reverse is not true. If the outer class needs a reference to
the inner-class object, it must create and initialize that reference itself.

Create a `class Box(contains: String, label: String)`, with `inner` classes
`Contents` holding `contains` as a `val`, and `Destination` holding `label` as
a `val`. Make two `private` instances: `contents` and `destination`,
initialized to instances of their associated `inner` classes.

Now create a `private val x` which is initialized to an object of an anonymous
inner class. In this case, however, the base-class is `Any`. Include a member
function `f()` which returns `"Any-based"`.

Add a member function `manifest()` which produces a `String` containing the
properties `contains` and `label` and the output of `f()`. The starter code in
`main()` will test your solution.

```kotlin
// InnerClasses/InnerEx2.kt
package innerclassesex2
import atomictest.eq

class Box(contains: String, label: String) {
  inner class Contents(val contains: String)
  inner class Destination(val label: String)
  private val contents = Contents(contains)
  private val destination = Destination(label)
  private val x = object : Any() {
    fun f() = "Any-based"
  }
  fun manifest() =
    "${contents.contains}: " +
    "${destination.label} ${x.f()}"
}

fun main() {
  Box("Computer", "Tasmania").manifest() eq
    "Computer: Tasmania Any-based"
}
```