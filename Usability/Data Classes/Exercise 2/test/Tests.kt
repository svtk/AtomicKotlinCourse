package dataClassesExercise2

import org.junit.Assert
import org.junit.Test

class TestDataClassesExercise2 {
  @Test
  fun testTransferTicket() {
    val ticket = AirlineTicket("Bruce", "Eckel", 123456, "DEN", "HND")
    Assert.assertEquals("Wrong result after copy",
      AirlineTicket("Svetlana", "Isakova", 123456, "DEN", "HND"),
      ticket.transferTicket("Svetlana", "Isakova"))
  }
}