package summary12

fun printTriangle(n: Int) {
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
  printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/
