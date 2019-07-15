package propertyAccessors1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestEmptiness {
    @Test
    fun testSample() {
        val cage = Cage(2)
        Assert.assertTrue("'cage.isEmpty' should return 'true' for an empty cage", cage.isEmpty)
        cage.put(Hamster("Alice"))
        Assert.assertFalse("'cage.isEmpty' should return 'false' for a non-empty cage", cage.isEmpty)
    }

    @Test
    fun testTwoHamsters() {
        val cage = Cage(3)
        Assert.assertTrue("'cage.isEmpty' should return 'true' for an empty cage", cage.isEmpty)
        cage.put(Hamster("Alice"))
        cage.put(Hamster("Bob"))
        Assert.assertFalse("'cage.isEmpty' should return 'false' for a non-empty cage", cage.isEmpty)
    }

    @Test
    fun testRemoval() {
        val cage = Cage(3)
        Assert.assertTrue("'cage.isEmpty' should return 'true' for an empty cage", cage.isEmpty)
        cage.put(Hamster("Alice"))
        cage.takeHamster()
        Assert.assertTrue("'cage.isEmpty' should return 'true' for an empty cage", cage.isEmpty)
    }
}

val Cage.isEmpty get() = false