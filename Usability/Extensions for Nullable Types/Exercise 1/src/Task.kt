package extensionsforNullableTypes1

import atomictest.eq

fun String?.orEmpty(): String = if (this != null) this else ""

fun main() {

  null.orEmpty() eq ""

  "abc".orEmpty() eq "abc"
}