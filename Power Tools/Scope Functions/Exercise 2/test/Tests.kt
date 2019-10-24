package scopeFunctionsExercise2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestScopeFunctionsExercise2 {
  private fun check(actual: String, expected: String) {
    Assert.assertEquals("Wrong result for sample",
      expected,
      actual)

  }

  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    val sb = StringBuilder()
    with(sb) {
      append("0")
    }
    check(sb.toString(), "0")

  }

  @Test(timeout = TIMEOUT)
  fun test2Sample() {
    check(StringBuilder().run {
      append("1")
      toString()
    }, "1")
  }

  @Test(timeout = TIMEOUT)
  fun test3Sample() {
    check(StringBuilder().let {
      it.append("2")
      it.toString()
    }, "2")
  }

  @Test(timeout = TIMEOUT)
  fun test4Sample() {
    check(StringBuilder().apply {
      append("3")
    }.toString(), "3")
  }

  @Test(timeout = TIMEOUT)
  fun test5Sample() {
    check(StringBuilder().also {
      it.append("4")
    }.toString(), "4")
  }
}