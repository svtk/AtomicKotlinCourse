package propertyAccessorsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.loadMemberProperty

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPropertyAccessorsExercise1 {
  private fun Cage.accessEmptyProperty(): Any? {
    val emptyProperty = loadMemberProperty(Cage::class, "empty")
    return emptyProperty.getter.call(this)
  }
  @Test(timeout = TIMEOUT)
  fun testSample() {
    val cage = Cage(2)
    Assert.assertEquals("'cage.empty' should return 'true' for an empty cage", true, cage.accessEmptyProperty())
    cage.put(Hamster("Alice"))
    Assert.assertEquals("'cage.empty' should return 'false' for a non-empty cage", false, cage.accessEmptyProperty())
  }

  @Test(timeout = TIMEOUT)
  fun testTwoHamsters() {
    val cage = Cage(3)
    Assert.assertEquals("'cage.empty' should return 'true' for an empty cage", true, cage.accessEmptyProperty())
    cage.put(Hamster("Alice"))
    cage.put(Hamster("Bob"))
    Assert.assertEquals("'cage.empty' should return 'false' for a non-empty cage", false, cage.accessEmptyProperty())
  }

  @Test(timeout = TIMEOUT)
  fun testRemoval() {
    val cage = Cage(3)
    Assert.assertEquals("'cage.empty' should return 'true' for an empty cage", true, cage.accessEmptyProperty())
    cage.put(Hamster("Alice"))
    cage.takeHamster()
    Assert.assertEquals("'cage.empty' should return 'true' for an empty cage", true, cage.accessEmptyProperty())
  }
}