package libraryHelpers1

class X {
    var first = 0
    var second = 0
    var third = 0
}

fun example1(x: X) {
    with(x) {
        first = 1
        second = 2
        third = 3
    }
}

class Y {
    fun start() {}
    fun finish() {}
}

fun example2(y: Y?) {
    y?.run {
        start()
        finish()
    }
}

class Z {
    fun init() {}
}

fun example3(z: Z) {
    val result = z.apply {
        init()
    }
}

fun main() {
    example1(X())
    example2(Y())
    example3(Z())
}