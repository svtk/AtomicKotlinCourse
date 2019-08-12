// Casting/SmartCast.kt
package downcasting
import atomictest.eq

class Dog : LivingBeing {
  fun bark() = "yip!"
}

fun dogBark(smb: LivingBeing) =
  if (smb is Dog) smb.bark() else "not Dog"

fun main() {
  dogBark(Dog()) eq "yip!"
  dogBark(Alien()) eq "not Dog"
}