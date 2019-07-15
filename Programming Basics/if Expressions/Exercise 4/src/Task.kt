package ifExpressions4

fun oneOrTheOther(exp: Boolean) =
        if (exp)
            "True!"
        else
            "False"

fun main(args: Array<String>) {
    val x = 1
    println(oneOrTheOther(x == 1))  // True!
}