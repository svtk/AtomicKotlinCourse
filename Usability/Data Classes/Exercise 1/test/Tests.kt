package dataClassesExercise1

import org.junit.Assert
import org.junit.Test
import util.*

class TestDataClassesExercise1 {
  @Test(timeout = TIMEOUT)
  fun test() {
    val ticketClass = loadClass("dataClassesExercise1", "AirlineTicket")
        .apply {
          assertParametersOfFirstConstructor(
              "firstName" to String::class,
              "lastName" to String::class,
              "ticket" to Int::class,
              "origin" to String::class,
              "destination" to String::class
          )
        }
    Assert.assertTrue("'AirlineTicket' class is expected to be defined as 'data' class", ticketClass.isData)
    runAndCheckSystemOutput("Wrong output",
      "AirlineTicket(firstName=Bruce, lastName=Eckel, ticket=123456, origin=DEN, destination=HND)") {
      val ticket = ticketClass.createInstance("Bruce", "Eckel", 123456, "DEN", "HND")
      println(ticket)
    }
  }
}