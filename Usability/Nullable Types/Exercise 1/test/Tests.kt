package nullableTypesExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNullableTypesExercise1 {
  @Test(timeout = TIMEOUT)
  fun test1SampleSuccess() {
    val cage = Cage(1)
    cage.put(Hamster("Alice"))
    Assert.assertEquals("'takeHamsterByName' should return a hamster with a given name",
      "Hamster('Alice')", cage.get("Alice").toString())
  }

  @Test(timeout = TIMEOUT)
  fun test2SampleNoHamster() {
    val cage = Cage(1)
    Assert.assertNull("Expected null when cage doesn't contain a hamster with a given name:",
      cage.get("Alice"))
  }
}