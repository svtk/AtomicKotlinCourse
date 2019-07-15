package creatingClasses1

fun isPalindrome(s: SimpleString): Boolean {
    for (i in 0 until s.length()) {
        if (s.get(i) != s.get(s.length() - 1 - i)) return false
    }
    return true
}

fun main() {
    println(isPalindrome(SimpleString("mom")))
    println(isPalindrome(SimpleString("mom!")))
}
/* Output:
true
*/