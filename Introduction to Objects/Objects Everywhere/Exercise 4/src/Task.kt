package objectsEverywhere4

fun reverseDecimal(number: Int): Int = number.toString().reversed().toInt()

fun main(args: Array<String>) {
    println(reverseDecimal(1234))  // 4321
}