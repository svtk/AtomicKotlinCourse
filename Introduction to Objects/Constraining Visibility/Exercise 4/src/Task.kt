package constrainingVisibility4

fun printSum(x: Int) {
    if (x <= 0) {
        println("Incorrect input: $x should be positive")
        return
    }
    println((0..x).sum())
}

fun printAverage(x: Int) {
    if (x <= 0) {
        println("Incorrect input: $x should be positive")
        return
    }
    println((0..x).average())
}

fun main(args: Array<String>) {
    printSum(-10)
    printAverage(-10)
}
/* Output:
Incorrect input: -10 should be positive
Incorrect input: -10 should be positive
*/