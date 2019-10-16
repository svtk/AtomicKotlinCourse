package mapsExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapsExercise1 {
  private fun checkBuildingMap(contactList: List<Contact>) {
    Assert.assertEquals("Incorrect result for $contactList:", contactList.associateBy { it.number }, buildNumberToContactMap(contactList))
  }

  @Test(timeout = TIMEOUT)
  fun testSample() = checkBuildingMap(listOf(Contact("Miffy", "1-234-567890"), Contact("Cleo", "098-765-4321")))

  @Test(timeout = TIMEOUT)
  fun testOneElement() = checkBuildingMap(listOf(Contact("A", "1")))

  @Test(timeout = TIMEOUT)
  fun testSameElements() = checkBuildingMap(listOf(Contact("A", "1"), Contact("B", "1")))

  @Test(timeout = TIMEOUT)
  fun testManyElements() = checkBuildingMap(listOf(
      Contact("A", "1"), Contact("B", "2"), Contact("C", "3"), Contact("D", "4"),
      Contact("E", "5"), Contact("F", "6"), Contact("G", "7"), Contact("H", "8")))
}