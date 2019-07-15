package theinKeyword2

fun sumOfEven(n: Int): Int {
    var result = 0
    for (i in 0..n step 2) {
        result += i
    }
    return result
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}