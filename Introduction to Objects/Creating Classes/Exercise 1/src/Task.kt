package creatingClasses1

class SomeClass {
  fun a() {
    println("42")
  }

  fun b() {
    a()
  }

  fun c() {
    this.b()
  }
}