// CreatingGenerics/CovariantList.kt
package variance

fun main() {
  val catList: List<Cat> = listOf(Cat())
  val petList: List<Pet> = catList
  var mutablePetList: MutableList<Pet> =
    mutableListOf(Cat())
  mutablePetList.add(Dog())
  // Type mismatch:
  // mutablePetList =
  //    mutableListOf<Cat>(Cat())  // [1]
}