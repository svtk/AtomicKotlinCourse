// LazyInitialization/LazyInitSoln1.kt
package lazyInitializationExercise1
import atomictest.*
import kotlin.reflect.KProperty1

fun compute(i: Int): Int {
  trace("Compute $i")
  return i
}

object Properties {
  val atDefinition = compute(1)
  val getter
    get() = compute(2)
  val lazyInit by lazy { compute(3) }
  val never by lazy { compute(4) }
}

fun main() {
  listOf(
    Properties::atDefinition,
    Properties::getter,
    Properties::lazyInit,
    Properties::never
  ).forEach {
    trace("${it.name}:")
    trace("${it.get()}")
    trace("${it.get()}")
  }
  trace eq """
    Compute 1
    atDefinition:
    1
    1
    getter:
    Compute 2
    2
    Compute 2
    2
    lazyInit:
    Compute 3
    3
    3
    never:
    Compute 4
    4
    4
  """
}