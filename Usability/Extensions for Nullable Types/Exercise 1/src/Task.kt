package extensionsforNullableTypes1

import atomictest.eq

fun String?.orEmpty(): String = if (this != null) this else ""

fun main(args: Array<String>) {

    null.orEmpty() eq ""

    "abc".orEmpty() eq "abc"
}