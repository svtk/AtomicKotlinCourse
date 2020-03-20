## Object-Oriented Design (#3)

Starting with:

```kotlin
interface TalkingAnimal {
  fun create(): TalkingAnimal
  fun speak() =
    trace("I'm a ${this::class.simpleName}")
}
```

Implement three classes: `Monkey`, `Giraffe` and `Hyena`. Now finish creating
the `House` class:

```kotlin
class House(
  val prototype: TalkingAnimal,
  val size: Int
) {
  val name: String = TODO()
  val denizens: List<TalkingAnimal> = TODO()
  fun report() = TODO()
}
```

Make your code satisfy the tests in `main()`.


```kotlin
// ObjectOrientedDesign/OODesignEx3.kt
package oodesignex3
import atomictest.*

private val trace = Trace()

interface TalkingAnimal {
  fun create(): TalkingAnimal
  fun speak() =
    trace("I'm a ${this::class.simpleName}")
}

class Monkey : TalkingAnimal {
  override fun create() = Monkey()
}

class Giraffe : TalkingAnimal {
  override fun create() = Giraffe()
  override fun speak() {
    super.speak()
    trace("The view is great up here!")
  }
}

class Hyena : TalkingAnimal {
  override fun create() = Hyena()
  override fun speak() {
    super.speak()
    trace("Yip Yip Yip!")
  }
}

class House(
  val prototype: TalkingAnimal,
  val size: Int
) {
  val name: String =
    "${prototype::class.simpleName} House"
  val denizens: List<TalkingAnimal> =
    List<TalkingAnimal>(size) {
      prototype.create()
    }
  fun report() {
    trace(name)
    denizens.forEach { it.speak() }
  }
}

fun main() {
  House(Giraffe(), 1).report()
  House(Hyena(), 2).report()
  House(Monkey(), 3).report()
  trace eq """
  Giraffe House
  I'm a Giraffe
  The view is great up here!
  Hyena House
  I'm a Hyena
  Yip Yip Yip!
  I'm a Hyena
  Yip Yip Yip!
  Monkey House
  I'm a Monkey
  I'm a Monkey
  I'm a Monkey
  """
}
```