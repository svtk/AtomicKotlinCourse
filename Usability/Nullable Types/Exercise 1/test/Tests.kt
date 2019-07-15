package nullableTypes1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestHamstersAndNullableTypes {
    @Test
    fun test1SampleSuccess() {
        val cage = Cage(1)
        cage.put(Hamster("Alice"))
        Assert.assertEquals("'takeHamsterByName' should return a hamster with a given name",
                "Hamster('Alice')", cage.takeHamsterByName("Alice").toString())
    }

    @Test
    fun test2SampleNoHamster() {
        val cage = Cage(1)
        Assert.assertNull("Expected null when cage doesn't contain a hamster with a given name:",
                cage.takeHamsterByName("Alice"))
    }
}