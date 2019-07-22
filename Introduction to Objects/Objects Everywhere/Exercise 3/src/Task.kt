package objectsEverywhere3

fun isPalindrome(s: String): Boolean =
    s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
    isPalindrome(s.toLowerCase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var onlyLetters = ""
  for (c in s) {
    if (c in 'a'..'z' || c in 'A'..'Z') {
      onlyLetters += c
    }
  }
  return isPalIgnoreCase(onlyLetters)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}