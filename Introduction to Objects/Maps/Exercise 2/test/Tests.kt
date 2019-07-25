package maps2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestTakingHamster {
  @Test(timeout = TIMEOUT)
  fun test1SampleSuccess() {
    val cage = Cage(2)
    cage.put(Hamster("Alice"))
    Assert.assertEquals("'takeHamsterByName' should return a hamster with a given name",
        "Hamster('Alice')", cage.takeHamsterByName("Alice").toString())
  }

  @Test(timeout = TIMEOUT)
  fun test2SampleNoHamster() {
    val cage = Cage(2)
    cage.put(Hamster("Alice"))
    try {
      cage.takeHamsterByName("Bob")
    } catch (e: NoSuchElementException) {
      Assert.assertEquals("Expected 'NoSuchElementException' when the cage doesn't contain a hamster with a given name:",
          e.javaClass.simpleName + (e.message?.let { ": $it" } ?: ""),
          "NoSuchElementException: No hamster called Bob")
    }
  }

  @Test(timeout = TIMEOUT)
  fun test3HamsterIsRemoved() {
    val cage = Cage(2)
    cage.put(Hamster("Alice"))
    cage.removeHamster("Alice")
    try {
      cage.takeHamsterByName("Alice")
    } catch (e: NoSuchElementException) {
      Assert.assertEquals("'removeHamster' should remove the hamster from the cage",
          e.javaClass.simpleName + (e.message?.let { ": $it" } ?: ""),
          "NoSuchElementException: No hamster called Alice")
    }
  }
}