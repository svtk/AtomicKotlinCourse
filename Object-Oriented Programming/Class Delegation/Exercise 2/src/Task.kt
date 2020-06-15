// ClassDelegation/ClassDelegEx2.kt
package classDelegationExercise2
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
  val mc = adapt(MyClass())
  utility1(mc)
  utility2(mc)
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