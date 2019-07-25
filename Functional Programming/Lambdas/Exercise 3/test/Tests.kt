package lambdas3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRegisterStudents {
  private fun checkRegisterStudents(names: List<String>, startId: Int) {
    Assert.assertEquals("Wrong result for startId = $startId, names = $names:",
        names.mapIndexed { index, name -> Student(index + startId, name) },
        registerStudents(names, startId))
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = checkRegisterStudents(listOf("Alice", "Bob"), 0)

  @Test(timeout = TIMEOUT)
  fun test2Sample() = checkRegisterStudents(listOf("Alice", "Bob"), 10)

  @Test(timeout = TIMEOUT)
  fun test3() = checkRegisterStudents(listOf("Alice", "Bob", "Charlie"), 1000)

  @Test(timeout = TIMEOUT)
  fun test4() = checkRegisterStudents(listOf(), 0)
}