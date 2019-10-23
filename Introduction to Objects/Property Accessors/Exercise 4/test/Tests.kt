package propertyAccessorsExercise4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPropertyAccessorsExercise4 {
  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    val strange = AccessCounter()
    Assert.assertEquals("'strange.accesses' should increment the value on each access",
      listOf(1, 2, 3),
      listOf(strange.accesses, strange.accesses, strange.accesses))
  }

  @Test(timeout = TIMEOUT)
  fun test2More() {
    val strange = AccessCounter()
    Assert.assertEquals("'strange.accesses' should increment the value on each access",
      listOf(1, 2, 3, 4, 5, 6),
      listOf(strange.accesses, strange.accesses, strange.accesses,
        strange.accesses, strange.accesses, strange.accesses))
  }

  private fun checkRepeat(n: Int) {
    val strange = AccessCounter()
    repeat(n) {
      strange.accesses
    }
    Assert.assertEquals("Incorrect result after repeating 'strange.accesses' for $n times;" +
      "Should be ${n + 1} on the next access: ",
      n + 1,
      strange.accesses)
  }

  @Test(timeout = TIMEOUT)
  fun test3Repeat() = checkRepeat(10)

  @Test(timeout = TIMEOUT)
  fun test4Repeat() = checkRepeat(100)
}