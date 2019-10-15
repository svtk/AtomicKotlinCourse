package memberReferences1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import java.util.*

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
  private fun check(
      list: List<Student>
  ) {
    Assert.assertEquals("Wrong result for $list:",
        list.sortedWith(compareByDescending(Student::grade)
            .then(compareBy(Student::surname, Student::name))),
        list.sortByGradeAndThenByName())
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check(listOf(
      Student("Alice", "Johnson", 3),
      Student("Bob", "Smith", 2),
      Student("Charlie", "Smith", 2)))

  @Test(timeout = TIMEOUT)
  fun test2() = check(listOf(
      Student("Alice", "Johnson", 1),
      Student("Bob", "Smith", 1),
      Student("Charlie", "Smith", 1)))

  @Test(timeout = TIMEOUT)
  fun test3() = check(listOf(
      Student("Bob", "Smith", 1),
      Student("Alice", "Smith", 1),
      Student("Charlie", "Smith", 1)))

  @Test(timeout = TIMEOUT)
  fun test4() = check(listOf(
      Student("Bob", "Smith", 2),
      Student("Alice", "Smith", 3),
      Student("Charlie", "Smith", 1)))

  @Test(timeout = TIMEOUT)
  fun test5() = check(listOf(
      Student("Alice", "Johnson", 1),
      Student("Alice", "Smith", 1),
      Student("Alice", "Jones", 1)))

  @Test(timeout = TIMEOUT)
  fun test6() {
    val names = ('A'..'E').map { "$it" }
    val surnames = (1..6).map { "S$it" }
    val random = Random()
    repeat(20) {
      check(names.shuffled().zip(surnames.shuffled()).map { (name, surname) ->
        Student(name, surname, random.nextInt(4))
      })
    }
  }
}