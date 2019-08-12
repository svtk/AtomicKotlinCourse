// Casting/WhenAndHierarchy.kt
package downcasting
import atomictest.eq

fun react(smb: LivingBeing) =
  when (smb) {
    is Human -> "It's only human"
    is Dog -> "Hi, dog!"
    is Alien -> "Alien!!!"
    else -> "Unknown living being"
  }

fun main() {
  react(Human()) eq "It's only human"
  react(Alien()) eq "Alien!!!"
}