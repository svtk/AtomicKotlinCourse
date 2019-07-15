package operationsonCollections1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecond {
    private fun checkOldest(list: List<Person>, requiredNumber: Int) {
        Assert.assertEquals("Wrong result for requiredNumber = $requiredNumber in $list:",
                list.sortedByDescending { it.age }
                        .take(requiredNumber).map { it.name }.sorted(),
                findOldest(list, requiredNumber)
        )
    }

    @Test
    fun test1Sample() {
        val people = listOf(
                Person("Bob", 30),
                Person("Charlie", 20),
                Person("Alice", 25))
        checkOldest(people, 1)
        checkOldest(people, 2)
    }

    @Test
    fun test2() {
        val names = setOf("X", "Y", "Z")
        val ages = setOf(10, 20, 30)
        for (i in 1..10) {
            val people = names.shuffled().zip(ages.shuffled()) {
                name, age -> Person(name, age)
            }
            checkOldest(people, 1)
            checkOldest(people, 2)
            checkOldest(people, 32)
        }
    }
}