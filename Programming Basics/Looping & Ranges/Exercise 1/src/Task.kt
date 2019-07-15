package loopingandRanges1

fun factorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun main(args: Array<String>) {
    println(factorial(10))  // 3628800
}