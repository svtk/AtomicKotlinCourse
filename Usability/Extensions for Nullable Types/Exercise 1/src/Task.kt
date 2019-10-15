package extensionsForNullableTypes1

import atomictest.eq

fun String?.orEmpty(): String = this ?: ""

fun main() {

  null.orEmpty() eq ""

  "abc".orEmpty() eq "abc"
}