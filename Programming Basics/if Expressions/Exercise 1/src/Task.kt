package ifExpressions1

fun checkSign(number: Int): String = 
        if (number > 0)
            "positive"
        else if (number < 0)
            "negative"
        else
            "zero"

fun main(args: Array<String>) {
    println(checkSign(-19))  // negative
}