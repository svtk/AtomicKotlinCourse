package summary3

fun printPyramid(n: Int) {
    for (i in 1..n) {
        repeat(n - i) {
            print(' ')
        }
        repeat(2 * i - 1) {
            print('#')
        }
        println()
    }
}

fun main() {
    printPyramid(4)
}
/* Output:
   #
  ###
 #####
#######
*/