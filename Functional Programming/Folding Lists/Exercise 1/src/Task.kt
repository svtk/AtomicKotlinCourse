package foldingLists01

import atomictest.eq

fun <T> List<T>.size(): Int =
        fold(0) { length, _ ->
            length + 1
        }

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    list.size() eq 3
}