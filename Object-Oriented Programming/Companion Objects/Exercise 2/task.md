## Companion Objects (#2)

Begin with these two interfaces:

```kotlin
interface BoardGame {
  fun move(): Boolean
  companion object {
    fun createBoard() {
      trace("BoardGame.createBoard()")
    }
  }
}

interface GameFactory {
  fun create(): BoardGame
}
```

Create two classes, `Checkers` and `Chess`, which inherit `BoardGame`. Give them
both `private` constructors with no arguments. Each class should contain a
`companion object Factory: GameFactory` that calls `createBoard()` in its
constructor. Each companion object contains a `const val max` that is used
within `move()`. The definitions of `playGame()` and `main()` are provided;
complete the code in `Checkers` and `Chess` so it satisfies the tests in
`main()`.

<sub> This task doesn't contain automatic tests,
so it's always marked as "Correct" when you run "Check".
Please compare your solution with the one provided! </sub>
