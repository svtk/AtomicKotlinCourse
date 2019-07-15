package creatingClasses2

fun isPalIgnoreCase(s: SimpleString): Boolean {
    for (i in 0 until s.length()) {
        val first = s.get(i).toLowerCase()
        val second = s.get(s.length() - 1 - i).toLowerCase()
        if (first != second) return false
    }
    return true
}

fun main() {
    println(isPalIgnoreCase(SimpleString("Mom")))
}
/* Output:
true
*/