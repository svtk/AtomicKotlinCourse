// OperatorOverloading/InvokeFunctionType.kt
package operatoroverloading
import atomictest.eq

fun main() {
  val func: (String) -> Int = { it.length }
  func("abc") eq 3
  func.invoke("abc") eq 3

  val nullableFunc: ((String) -> Int)? = null
  if (nullableFunc != null) {
    nullableFunc("abc")
  }
  nullableFunc?.invoke("abc")  // [1]
}