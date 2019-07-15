package constrainingVisibility3

fun printSum(x: Int) {
    if (x <= 0) {
        println("Incorrect input: $x should be positive")
        return
    }
    println((0..x).sum())
}

fun main(args: Array<String>) {
    printSum(-10)
}
/* Output:
Incorrect input: -10 should be positive
*/