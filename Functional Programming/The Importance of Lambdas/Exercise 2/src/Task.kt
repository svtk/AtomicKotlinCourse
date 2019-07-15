package theImportanceofLambdas2

import atomictest.eq

fun filterNonBlank(strings: List<String>): List<String> {
    return strings.filter { it.isNotBlank() }
}

fun main(args: Array<String>) {
    filterNonBlank(listOf("", "a", "  ")) eq listOf("a")
}