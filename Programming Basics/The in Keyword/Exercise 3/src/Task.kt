package theinKeyword3

fun isLowerCase(ch: Char): Boolean = ch in 'a'..'z'

fun main(args: Array<String>) {
    println(isLowerCase('A'))  // false
    println(isLowerCase('b'))  // true
}