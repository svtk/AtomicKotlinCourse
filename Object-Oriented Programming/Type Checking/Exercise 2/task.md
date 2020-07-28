## Type Checking (#2)

Add a `DecomposableBottle` to both `BeverageContainer2.kt` (remove `recycle()`)
and `BeverageContainer3.kt`. `DecomposableBottle`'s recycling `String` is
"Decomposition tank".

Notice the different experience between the two examples.

> Solution 2

```kotlin
// TypeChecking/TypeCheckingSoln2a.kt
package typecheckingsoln2a
import atomictest.eq

sealed class BeverageContainer {
  abstract fun open(): String
  abstract fun pour(): String
}

sealed class Can: BeverageContainer() {
  override fun open() = "Pop Top"
  override fun pour() = "Can: Pour"
}

class SteelCan: Can()
class AluminumCan: Can()

sealed class Bottle: BeverageContainer() {
  override fun open() = "Remove Cap"
  override fun pour() = "Bottle: Pour"
}

class GlassBottle: Bottle()
sealed class PlasticBottle: Bottle()
class PETBottle: PlasticBottle()
class HDPEBottle: PlasticBottle()
class DecomposableBottle: PlasticBottle()

fun BeverageContainer.recycle2() =
  when(this) {
    is Can -> when(this) {
      is SteelCan -> "Recycle Steel"
      is AluminumCan -> "Recycle Aluminum"
    }
    is Bottle -> when(this) {
      is GlassBottle -> "Recycle Glass"
      is PlasticBottle -> when(this) {
        is PETBottle -> "Recycle PET"
        is HDPEBottle -> "Recycle HDPE"
        is DecomposableBottle -> "Decomposition tank"
      }
    }
  }

fun main() {
  val refrigerator = listOf(
    SteelCan(), AluminumCan(),
    GlassBottle(),
    PETBottle(), HDPEBottle(),
    DecomposableBottle()
  )
  refrigerator.map { it.open() } eq
    "[Pop Top, Pop Top, Remove Cap, " +
    "Remove Cap, Remove Cap, Remove Cap]"
  refrigerator.map { it.recycle2() } eq
    "[Recycle Steel, Recycle Aluminum, " +
    "Recycle Glass, " +
    "Recycle PET, Recycle HDPE, " +
    "Decomposition tank]"
}
```

```kotlin
// TypeChecking/TypeCheckingSoln2b.kt
package typecheckingsoln2b
import atomictest.eq
import typechecking.name

interface BeverageContainer {
  fun open(): String
  fun pour() = "${this.name}: Pour"
  fun recycle(): String
}

abstract class Can: BeverageContainer {
  override fun open() = "Pop Top"
}

class SteelCan: Can() {
  override fun recycle() = "Recycle Steel"
}

class AluminumCan: Can() {
  override fun recycle() = "Recycle Aluminum"
}

abstract class Bottle: BeverageContainer {
  override fun open() = "Remove Cap"
}

class GlassBottle: Bottle() {
  override fun recycle() = "Recycle Glass"
}

abstract class PlasticBottle: Bottle()

class PETBottle: PlasticBottle() {
  override fun recycle() = "Recycle PET"
}

class HDPEBottle: PlasticBottle() {
  override fun recycle() = "Recycle HDPE"
}

class DecomposableBottle: PlasticBottle() {
  override fun recycle() = "Decomposition tank"
}

fun main() {
  val refrigerator = listOf(
    SteelCan(), AluminumCan(),
    GlassBottle(),
    PETBottle(), HDPEBottle(),
    DecomposableBottle()
  )
  refrigerator.map { it.open() } eq
    "[Pop Top, Pop Top, Remove Cap, " +
    "Remove Cap, Remove Cap, Remove Cap]"
  refrigerator.map { it.recycle() } eq
    "[Recycle Steel, Recycle Aluminum, " +
    "Recycle Glass, " +
    "Recycle PET, Recycle HDPE, " +
    "Decomposition tank]"
}
```