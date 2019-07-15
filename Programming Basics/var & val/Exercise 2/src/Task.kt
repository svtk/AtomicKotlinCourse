package varandval2

fun main(args: Array<String>) {
    var x = 1
    var y = 2
    val tmp = x
    x = y
    y = tmp
    println(x)
    println(y)
}