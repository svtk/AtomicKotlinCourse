package exceptions2

import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException
import util.runAndCheckSystemOutput

class TestAbort {
  @Rule
  @JvmField
  val thrown: ExpectedException = ExpectedException.none()

  @Test
  fun test1() {
    thrown.expect(Exception::class.java)
    abort("My message")
  }

  @Test
  fun test2() {
    thrown.expectMessage("My message")
    abort("My message")
  }

    @Test
    fun test3() {
        runAndCheckSystemOutput(
          "Wrong output after running 'main'",
          "Exception: Stop!"
        ) {
            main()
        }
    }
}