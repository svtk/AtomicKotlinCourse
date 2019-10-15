package theWithFunction1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import kotlin.text.buildString as buildStringLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBuildStringViaWith {
  private fun check(
      message: String,
      action: StringBuilder.() -> Unit
  ) {
    Assert.assertEquals(message,
        buildStringLibrary(action),
        buildString(action))

  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() = check("Wrong result for sample") {
    append("Alphabet: ")
    for (ch in 'a'..'z') {
      append(ch)
    }
  }

  @Test(timeout = TIMEOUT)
  fun test2() = check("""Wrong result for 'buildString { append("hi!") }'""") {
    append("hi!")
  }
}