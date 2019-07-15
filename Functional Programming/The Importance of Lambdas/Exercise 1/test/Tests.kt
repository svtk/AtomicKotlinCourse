package theImportanceofLambdas1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAdults {
    private fun checkNames(people: List<Person>) {
        Assert.assertEquals("Wrong result for $people:",
                people.filter { it.age > 17 }.map { it.name },
                people.getNamesOfAdults())
    }

    @Test
    fun test1Sample() = checkNames(listOf(Person("Alice", 17), Person("Bob", 19)))

    @Test
    fun test2() = checkNames(listOf(Person("Alice", 17), Person("Bob", 19), Person("Charlie", 18)))
}