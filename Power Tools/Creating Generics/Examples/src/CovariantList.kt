// CreatingGenerics/CovariantList.kt
package variance

fun main() {
  val listOfCats: List<Cat> = listOf(Cat())
  val listOfPets: List<Pet> = listOfCats

  val mListOfCats: MutableList<Cat> =
    mutableListOf(Cat())
  // Doesn't compile:
  // val mListOfPets: MutableList<Pet> =
  //  mListOfCats                       // [1]
  // mListOfPets.add(Dog())
}