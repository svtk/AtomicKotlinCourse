package propertyAccessors4

import atomictest.eq

class AccessCounter {
  private var _accesses = 0

  val accesses: Int
    get() = ++_accesses
}

fun main() {
  val strange = AccessCounter()
  strange.accesses eq 1
  strange.accesses eq 2
  strange.accesses eq 3

  val strange2 = AccessCounter()
  repeat(10) {
    strange2.accesses
  }
  strange2.accesses eq 11
}