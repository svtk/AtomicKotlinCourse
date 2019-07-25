package libraryHelpers1

class X {
  var first = 0
  var second = 0
  var third = 0
}

fun example1(x: X): String {
  with(x) {
    first = 1
    second = 2
    third = 3
  }
  return "with"
}

class Y {
  fun start() {}
  fun finish() {}
}

fun example2(y: Y?): String {
  y?.run {
    start()
    finish()
  }
  return "run"
}

class Z {
  fun init() {}
}

fun example3(z: Z): String {
  val result = z.apply {
    init()
  }
  println(result)
  return "apply"
}

fun main() {
  example1(X())
  example2(Y())
  example3(Z())
}