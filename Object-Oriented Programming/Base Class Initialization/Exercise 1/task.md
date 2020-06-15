## Base Class Initialization (#1)

Create a class `A`. Inside its `init`, call `println("A")`. Inherit `B` from
`A`. Inherit `C` from `B`. Give them similar `init`s. Inside `main()`, create
an instance of `C` to display the initialization order.

> Solution

```kotlin
// BaseClassInit/BCIExercise1.kt
package baseClassInitializationExercise1

open class A {
  init {
    println("A")
  }
}

open class B : A() {
  init {
    println("B")
  }
}

class C : B() {
  init {
    println("C")
  }
}

fun main() {
  C()
}
/* Exercise output:
A
B
C
*/
```