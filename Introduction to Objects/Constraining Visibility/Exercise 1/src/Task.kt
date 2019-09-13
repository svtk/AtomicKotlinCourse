package constrainingVisibility1

class Alien(val name: String, val species: String, private var planet: String) {
   fun movePlanet(newPlanet: String) {
     planet = newPlanet
   }

  override fun toString(): String {
    return "Alien $name, $species: $planet"
  }
}

fun main() {
  val alien1 = Alien("Arthricia",	"Cat Person",	"PurgeWorld")
  alien1.movePlanet("Earth C-137")
  val alien2 = Alien("Dale", "Giant", "Gearworld")
  alien2.movePlanet("Parblesnops")
}