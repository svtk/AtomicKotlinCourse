package theImportanceofLambdas1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAdults {
  private fun checkNames(people: List<Person>) {
    Assert.assertEquals("Wrong result for $people:",
        people.filter { it.age > 17 }.map { it.name },
        people.getNamesOfAdults())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkNames(listOf(Person("Alice", 17), Person("Bob", 19)))

  @Test(timeout = TIMEOUT)
  fun test2() = checkNames(listOf(Person("Alice", 17), Person("Bob", 19), Person("Charlie", 18)))
}