package secondaryConstructorsExercise1

import atomictest.eq
import secondaryConstructorsExercise1.Material.*

enum class Material {
  Ceramic, Metal, Plastic
}

class GardenItem(
  val name: String = "Strange Thing",
  val material: Material = Plastic
) {
  override fun toString() = "$material $name"
}

fun main() {
  GardenItem("Elf").material eq Plastic
  GardenItem("Snowman").name eq "Snowman"
  GardenItem("Gazing Ball", Metal) eq
    "Metal Gazing Ball"
  GardenItem(material = Ceramic) eq
    "Ceramic Strange Thing"
}