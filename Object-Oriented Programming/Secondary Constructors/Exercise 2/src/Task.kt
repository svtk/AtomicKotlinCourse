package secondaryConstructorsExercise2

class SpaceShip(val name: String) {

    constructor(name: String, shipClass: String) : this(name) {
        this.shipClass = shipClass
    }

    constructor(name: String, shipClass: String, weight: Int) : this(name) {
        this.shipClass = shipClass
        this.weight = weight
    }

    var shipClass: String = "Unknown"
    var weight: Int = 100
}
