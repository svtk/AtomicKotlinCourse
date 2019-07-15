package stacktrace

fun foo() {
    throw IllegalStateException("something is wrong")
}

fun bar() {
    foo()
}

fun main(args: Array<String>) {
    bar()
}