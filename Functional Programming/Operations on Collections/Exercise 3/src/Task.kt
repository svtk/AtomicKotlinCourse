package operationsonCollections3

import atomictest.eq

fun sum(list: List<Int?>): Int {
    return list.filterNotNull().sum()
}

fun main(args: Array<String>) {
    sum(listOf(1, 2, null)) eq 3
}