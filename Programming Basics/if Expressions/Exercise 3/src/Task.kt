package ifExpressions3

fun findMax(first: Int, second: Int): Int = 
        if (first > second) first else second

fun main(args: Array<String>) {
    println(findMax(-1, 4))  // 4
}