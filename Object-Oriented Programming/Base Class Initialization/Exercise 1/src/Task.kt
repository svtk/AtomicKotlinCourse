// BaseClassInit/BCIExercise1.kt
package baseClassInitializationExercise1

open class Animal(val sound: String = "???")

class Cat(sound: String = "meow") : Animal(sound)

class Dog(sound: String = "woof") : Animal(sound)

fun main() {
  val animal = Animal()
  println(animal.sound)
  val cat = Cat()
  println(cat.sound)
  val dog = Dog()
  println(dog.sound)
}