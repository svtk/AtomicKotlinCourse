package maps1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestContactMap {
    private fun checkBuildingMap(contactList: List<Contact>) {
        Assert.assertEquals("Incorrect result for $contactList:", contactList.associateBy { it.number }, buildNumberToContactMap(contactList))
    }

    @Test
    fun testSample() = checkBuildingMap(listOf(Contact("Miffy", "1-234-567890"), Contact("Cleo", "098-765-4321")))

    @Test
    fun testOneElement() = checkBuildingMap(listOf(Contact("A", "1")))

    @Test
    fun testSameElements() = checkBuildingMap(listOf(Contact("A", "1"), Contact("B", "1")))

    @Test
    fun testManyElements() = checkBuildingMap(listOf(
            Contact("A", "1"), Contact("B", "2"), Contact("C", "3"), Contact("D", "4"),
            Contact("E", "5"), Contact("F", "6"), Contact("G", "7"), Contact("H", "8")))
}