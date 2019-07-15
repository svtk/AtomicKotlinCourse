package sets2

import atomictest.eq

fun hasUniqueCharacters(s: String): Boolean {
    return s.toSet().size == s.length
}

fun main(args: Array<String>) {
    hasUniqueCharacters("abcd") eq true
    hasUniqueCharacters("abcb") eq false
}