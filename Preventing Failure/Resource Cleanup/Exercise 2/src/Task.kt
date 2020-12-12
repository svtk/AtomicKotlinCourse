// ResourceCleanup/ResourceCleanupSoln2.kt
package resourceCleanupExercise2
import atomictest.trace

class Cleanup : AutoCloseable {
  fun f() = trace("f()")
  fun g() = trace("g()")
  fun h() = trace("h()")
  override fun close() = trace("close()")
}

fun main() {
  Cleanup().use {
    it.f()
    it.g()
    it.h()
  }
  trace eq "f() g() h() close()"
}