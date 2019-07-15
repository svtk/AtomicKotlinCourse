package stringTemplates1

fun findMax(first: Int, second: Int): Int = 
        if (first > second) first else second

fun main(args: Array<String>) {
    val first = 17
    val second = 31
    
    val max = findMax(first, second)
    println("The maximum between $first and $second is $max.")
}