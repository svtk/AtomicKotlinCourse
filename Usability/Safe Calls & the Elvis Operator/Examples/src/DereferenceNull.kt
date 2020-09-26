// SafeCallsAndElvis/DereferenceNull.kt
package safecalls

fun main() {
  val s: String? = null
  // Doesn't compile:
  // s.length        // [1]
}