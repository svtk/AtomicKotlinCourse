package functionTypes2

import atomictest.eq

fun List<Int>.transform1(): List<Int> {
    return filter { it % 2 == 0 }.map { it * it }
}

fun List<Int>.transform2(): List<Int> {
    return mapNotNull { if (it % 2 == 0) it * it else null }
}

fun main() {
    val list = listOf(1, 2, 3)
    list.transform1() eq listOf(4)
    list.transform2() eq listOf(4)
}