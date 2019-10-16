package recursionExercise4

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestRecursionExercise4 {
  private fun checkSample(from: City, result: Set<City>) {
    Assert.assertEquals("Wrong result for sample '${from.name}.getAllReachableRecursive()'", result,
        from.getAllReachableRecursive())
    Assert.assertEquals("Wrong result for sample '${from.name}.getAllReachableIterative()'", result,
        from.getAllReachableIterative())
  }

  private fun check(cities: List<City>, from: Int, result: Set<Int>) {
    val expectedResultSorted = result.map { cities[it] }.sortedBy { it.name }
    Assert.assertEquals("Wrong result for '${cities[from].name}.getAllReachableRecursive()' for $cities",
        expectedResultSorted,
        cities[from].getAllReachableRecursive().sortedBy { it.name })
    Assert.assertEquals("Wrong result for '${cities[from].name}.getAllReachableIterative()' for $cities",
        expectedResultSorted,
        cities[from].getAllReachableIterative().sortedBy { it.name })
  }

  private fun addConnections(cities: List<City>, vararg pairs: Pair<Int, Int>) {
    pairs.forEach {
      addConnection(cities[it.first], cities[it.second])
    }
  }

  private fun IntRange.toCities() = map { City("City-${it + 1}") }

  @Test(timeout = TIMEOUT)
  fun test1Sample() {
    val dublin = City("Dublin")
    val liverpool = City("Liverpool")
    val manchester = City("Manchester")
    val leeds = City("Leeds")

    addConnection(liverpool, manchester)
    addConnection(manchester, leeds)

    checkSample(liverpool, setOf(liverpool, manchester, leeds))
    checkSample(dublin, setOf(dublin))
  }

  @Test(timeout = TIMEOUT)
  fun test2() {
    val cities = (0..4).toCities()

    addConnections(cities, 0 to 1, 1 to 2, 2 to 3, 3 to 4)

    check(cities, 0, setOf(0, 1, 2, 3, 4))
  }

  @Test(timeout = TIMEOUT)
  fun test3() {
    val cities = (0..1).toCities()

    check(cities, 0, setOf(0))
  }

  @Test(timeout = TIMEOUT)
  fun test4() {
    val cities = (0..9).map { City("City$it") }
    addConnections(cities, 1 to 2, 2 to 4, 4 to 5, 1 to 3, 3 to 6, 3 to 7, 8 to 9)

    check(cities, 1, setOf(1, 2, 3, 4, 5, 6, 7))
    check(cities, 9, setOf(8, 9))
  }
}