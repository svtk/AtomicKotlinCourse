package dataClassesExercise1

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT
import util.checkParametersOfConstructor
import util.loadClass
import util.runAndCheckSystemOutput

class TestDataClassesExercise1 {
  @Test(timeout = TIMEOUT)
  fun test() {
    val ticketClass = loadClass("dataClassesExercise1", "AirlineTicket")

    val constructor = ticketClass.constructors.first()
    checkParametersOfConstructor(constructor, ticketClass, listOf(
      "firstName" to "kotlin.String",
      "lastName" to "kotlin.String",
      "ticket" to "kotlin.Int",
      "origin" to "kotlin.String",
      "destination" to "kotlin.String"
    ))
    Assert.assertTrue("'AirlineTicket' class is expected to be defined as 'data' class", ticketClass.isData)
    runAndCheckSystemOutput("Wrong output",
      "AirlineTicket(firstName=Bruce, lastName=Eckel, ticket=123456, origin=DEN, destination=HND)") {
      val ticket = constructor.call("Bruce", "Eckel", 123456, "DEN", "HND")
      println(ticket)
    }
  }
}