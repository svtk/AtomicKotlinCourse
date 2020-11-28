// OperatorOverloading/InvokeFunctionType.kt
package operatoroverloading

import atomictest.eq

fun main() {
  val func: (String) -> Int = { it.length }
  val nullableFunc: ((String) -> Int)? = null
  func("abc") eq 3
  func.invoke("abc") eq 3

  if (nullableFunc != null) {
    nullableFunc("abc")
  }
  nullableFunc?.invoke("abc")
}