package overloadingExercise1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestOverloading {

  private fun testList(actual: String, expected: String) {
    Assert.assertEquals("Wrong result: ", expected, actual)
  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    val list = listOf(1, 2, 3)
    testList(list.myJoinToString(), "1, 2, 3")
    testList(list.myJoinToString("|"), "1|2|3")
    testList(list.myJoinToString("..", "List: "), "List: 1..2..3")
  }

  @Test(timeout = TIMEOUT)
  fun test2() = testList(
      listOf(1, 2, 3, 4, 5, 6).myJoinToString(""),
      "123456"
  )

  @Test(timeout = TIMEOUT)
  fun test3() = testList(
      listOf(1, 2, 3, 4).myJoinToString(),
      "1, 2, 3, 4"
  )

  @Test(timeout = TIMEOUT)
  fun test4() = testList(
      listOf(1, 2, 3, 4).myJoinToString(",", "##"),
      "##1,2,3,4"
  )
}