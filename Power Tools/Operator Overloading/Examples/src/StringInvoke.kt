// OperatorOverloading/StringInvoke.kt
package operatoroverloading
import atomictest.eq

operator fun String.invoke(
  f: (s: String) -> String
) = f(this)

fun main() {
  "mumbling" { it.toUpperCase() } eq
    "MUMBLING"
}