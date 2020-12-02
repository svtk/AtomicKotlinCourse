// CreatingGenerics/CovariantReturnTypes.kt
package variance

interface Parent
interface Child : Parent

interface  X {
  fun f(): Parent
}

interface Y : X {
  override fun f(): Child
}