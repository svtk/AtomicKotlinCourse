package ifExpressions2

fun abs(number: Int): Int = 
        if (number > 0) number else -number

fun main(args: Array<String>) {
    println(abs(-19))  // 19
}