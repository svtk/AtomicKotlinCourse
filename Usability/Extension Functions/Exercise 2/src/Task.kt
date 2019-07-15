package extensionFunctions2

import atomictest.eq

fun Int.isOdd(): Boolean = this % 2 == 1
fun Int.isEven(): Boolean = !isOdd()

fun main(args: Array<String>) {
    1.isOdd() eq true
    2.isEven() eq true
    13.isEven() eq false
}