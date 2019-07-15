package theinKeyword1

fun getAlphabet(): String {
    var s = ""
    for (c in 'a'..'z') {
        s += c
    }
    return s
}

fun main(args: Array<String>) {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}