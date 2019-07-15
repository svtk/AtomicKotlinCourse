package overloading2

import atomictest.eq

fun f(n: Int = 0) = n + 373

fun main(args: Array<String>) {
    f() eq 373
}