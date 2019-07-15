package propertyAccessors1

import atomictest.eq

class Hamster(val name: String) {
    override fun toString(): String {
        return "Hamster('$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters =
            mutableListOf<Hamster>()

    val capacity: Int
        get() = maxCapacity - hamsters.size

    val isFull: Boolean
        get() = hamsters.size == maxCapacity

    val isEmpty: Boolean
        get() = hamsters.isEmpty()

    fun put(hamster: Hamster): Boolean =
            if(isFull)
                false
            else {
                hamsters += hamster
                true
            }

    fun takeHamster(): Hamster =
            hamsters.removeAt(0)
}

/*
fun main(args: Array<String>) {
    val cage = Cage(2)
    cage.isEmpty eq true
    cage.put(Hamster("Alice"))
    cage.isEmpty eq false
}*/