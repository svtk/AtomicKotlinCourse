## Class Delegation (#3)

What happens when you delegate to two interfaces that have one or more
functions or fields in common? Start with two interfaces:

```kotlin
interface A {
  val x: Int
  val z: Int
  fun u()
  fun v()
}

interface B {
  val y: Int
  val z: Int
  fun v()
  fun w()
}
```

Create a class `AA` that implements `A`, producing the value `1` for `x` and
`z`, and tracing `"AA.u()"` for `u()` and `"AA.v()"` for `v()`. Create a
similar implementation `BB` implementing `B`. Now create a class `Delegation`
which delegates to both `A` and `B`. IntelliJ or the compiler will tell you
what you need to do to solve the collisions.

```kotlin
// ClassDelegation/ClassDelegEx3.kt
package classdelegationex3
import atomictest.*

private val trace = Trace()

interface A {
  val x: Int
  val z: Int
  fun u()
  fun v()
}

interface B {
  val y: Int
  val z: Int
  fun v()
  fun w()
}

class AA : A {
  override val x = 1
  override val z = 1
  override fun u() = trace("AA.u()")
  override fun v() = trace("AA.v()")
}

class BB : B {
  override val y = 1
  override val z = 1
  override fun v() = trace("BB.v()")
  override fun w() = trace("BB.w()")
}

class Delegation(val a: A, val b: B) :
  A by a, B by b {
  override val z = a.z + b.z
  override fun v() {
    trace("Delegation.v()")
    a.v()
    b.v()
    trace("Delegation.z: $z")
  }
}

fun main() {
  val d = Delegation(AA(), BB())
  d.u()
  d.v()
  d.w()
  trace eq """
  AA.u()
  Delegation.v()
  AA.v()
  BB.v()
  Delegation.z: 2
  BB.w()
  """
}
```