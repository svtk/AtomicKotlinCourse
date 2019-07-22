package objectsEverywhere1

fun isPalindrome(s: String): Boolean = s.reversed() == s

fun main() {
  println(isPalindrome("mom"))     // true
  println(isPalindrome("street"))  // false
}