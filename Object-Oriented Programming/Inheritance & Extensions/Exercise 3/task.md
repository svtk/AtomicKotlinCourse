## Inheritance & Extensions (#3)

Starting with `Adapter.kt` and `ComposeAdapter.kt`, create a function which
dynamically adapts an object, accepting a `MyClass` and returning a
`MyClassAdaptedForLib`. Is it possible to use the inheritance approach in
`Adapter.kt`, or are you forced to use composition? (We'll revisit this issue
in [Class Delegation]).

```kotlin
// InheritanceExtensions/InhExtensionsEx3.kt
package inheritanceextensionsex3
import usefullibrary.*
import atomictest.*

private val trace = Trace()

class MyClass {
  fun g() = trace("g()")
  fun h() = trace("h()")
}

fun useMyClass(mc: MyClass) {
  mc.g()
  mc.h()
}

class MyClassAdaptedForLib(
  val field: MyClass
) : LibType {
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
  useMyClass(mc.field)
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