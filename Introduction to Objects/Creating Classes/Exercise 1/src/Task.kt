package creatingClasses1

fun isPalindrome(s: String): Boolean {
  for (i in 0 until s.length) {
    if (s.get(i) != s.get(s.length - 1 - i)) return false
  }
  return true
}

fun main() {
  println(isPalindrome("mom"))
  println(isPalindrome("mom!"))
}
/* Output:
true
false
*/
