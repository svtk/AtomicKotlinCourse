## Class Delegation (#2)

Exercise 3 in [Inheritance & Extensions] uses composition to adapt `MyClass` to
work with `UsefulLibrary`. This produces an inconsistency when using `MyClass`
with the `useMyClass()` function: the composed `field` must be explicitly named
during the call:

```kotlin
useMyClass(mc.field)
```

Modify the solution to that exercise using class delegation so you can call a
function `useMyType(mc)`. Make the `field` argument to `MyClassAdaptedForLib`
`private` so you *cannot* expose `field`.

Because class delegation works with interfaces, you must first create an
interface `MyType` for `MyClass`. If you're using IntelliJ IDEA, you can do
this by right-clicking `MyClass`, selecting "Refactor," then choosing "Extract
Interface." Modify the rest of the code to use `MyType` whenever possible,
rather than `MyClass`, and rename `useMyClass()` to `useMyType()`.

Now modify `MyClassAdaptedForLib` so that `field` is `private` and is the
delegate for `MyType`.

```kotlin
// ClassDelegation/ClassDelegEx2.kt
package classdelegationex2
import usefullibrary.*
import atomictest.*

private val trace = Trace()

interface MyType {
  fun g()
  fun h()
}

class MyClass: MyType {
  override fun g() = trace("g()")
  override fun h() = trace("h()")
}

fun useMyType(mt: MyType) {
  mt.g()
  mt.h()
}

class MyClassAdaptedForLib(
  private val field: MyClass
) : LibType, MyType by field {
  override fun f1() = field.h()
  override fun f2() = field.g()
}

fun adapt(mc: MyClass) =
  MyClassAdaptedForLib(mc)

fun main() {
  val library = UsefulLibrary()
  val mc = adapt(MyClass())
  library.utility1(mc)
  library.utility2(mc)
  useMyType(mc)
  trace eq """
  h()
  g()
  g()
  h()
  g()
  h()
  """
}
```