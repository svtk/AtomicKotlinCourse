// InheritanceExtensions/InhExtensionsEx3.kt
package inheritanceAndExtensionsExercise3
import usefullibrary.*
import atomictest.*

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
  val mc = adapt(MyClass())
  utility1(mc)
  utility2(mc)
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