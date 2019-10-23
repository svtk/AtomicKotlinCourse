package exceptionsExercise2

import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.runAndCheckSystemOutput

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestExceptionsExercise2 {
  @Rule
  @JvmField
  val thrown: ExpectedException = ExpectedException.none()

  @Test(timeout = TIMEOUT)
  fun test1() {
    thrown.expect(Exception::class.java)
    abort("My message")
  }

  @Test(timeout = TIMEOUT)
  fun test2() {
    thrown.expectMessage("My message")
    abort("My message")
  }

  @Test(timeout = TIMEOUT)
  fun test3() {
    runAndCheckSystemOutput(
      "Wrong output after running 'main'",
      "Exception: Stop!"
    ) {
      main()
    }
  }
}