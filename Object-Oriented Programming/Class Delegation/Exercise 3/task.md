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
which delegates to both `A` and `B`. IntelliJ or the compiler will guide you in
resolving the collisions.