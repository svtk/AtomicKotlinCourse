package foldingLists02

import atomictest.eq

fun <T> List<T>.count(predicate: (T) -> Boolean): Int =
        fold(0) {
            count, element ->
            if (predicate(element)) count + 1 else count
        }

fun main(args: Array<String>) {
    val list = listOf(1, -2, 3)
    list.count { it > 0 } eq 2
}