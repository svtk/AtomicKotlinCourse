package functionsInsideFunctions1

import atomictest.eq

fun <T> List<T>.find(predicate: (T) -> Boolean): T? {
    forEach {
        if (predicate(it)) return it
    }
    return null
}

fun main(args: Array<String>) {
    listOf(1, 2, 3).find { it < 0 } eq null
    listOf(1, -2, -3).find { it < 0 } eq -2
}