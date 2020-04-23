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

Make your code satisfy the tests in the starter code in `main()`.