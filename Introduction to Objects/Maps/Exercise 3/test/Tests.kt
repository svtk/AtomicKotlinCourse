package maps3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTakingHamster {
    @Test
    fun test1SampleSuccess() {
        val cage = Cage(2)
        cage.put(Hamster("Alice"))
        Assert.assertEquals("'takeHamsterByName' should return a hamster with a given name",
                "Hamster('Alice')", cage.takeHamsterByName("Alice").toString())
    }

    @Test
    fun test2SampleNoHamster() {
        val cage = Cage(2)
        cage.put(Hamster("Alice"))
        try {
            cage.takeHamsterByName("Bob")
        } catch (e: NoSuchElementException) {
            Assert.assertEquals("Expected 'NoSuchElementException' when the hamster is absent:",
                    e.javaClass.simpleName + (e.message?.let { ": $it" } ?: ""),
                    "NoSuchElementException: Key Bob is missing in the map.")
        }
    }
}