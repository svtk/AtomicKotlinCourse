package loopingandRanges4

fun printHalfPyramid(n: Int) {
    for (i in 1..n) {
        repeat(i) {
            print("#")
        }
        println()
    }
}

fun main(args: Array<String>) {
    printHalfPyramid(4)
}
/* Output:
#
##
###
####
*/