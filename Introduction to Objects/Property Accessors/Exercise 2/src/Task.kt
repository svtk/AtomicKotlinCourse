package propertyAccessors2

import atomictest.eq

class Strange {
    private var _accesses = 0

    val accesses: Int
        get() = ++_accesses
}

fun main(args: Array<String>) {
    val strange = Strange()
    strange.accesses eq 1
    strange.accesses eq 2
    strange.accesses eq 3

    val strange2 = Strange()
    repeat(10) {
        strange2.accesses
    }
    strange2.accesses eq 11
}