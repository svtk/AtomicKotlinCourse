package recursion3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestReachable {
    private fun checkRecursiveSample(from: City, to: City, result: Boolean) {
        Assert.assertEquals("Wrong result for sample 'isReachableRecursive(${from.name}, ${to.name})'", result,
                isReachableRecursive(from, to))
    }

    private fun checkIterativeSample(from: City, to: City, result: Boolean) {
        Assert.assertEquals("Wrong result for sample 'isReachableRecursive(${from.name}, ${to.name})'", result,
                isReachableIterative(from, to))
    }

    private fun checkRecursive(cities: List<City>, from: City, to: City, result: Boolean) {
        Assert.assertEquals("Wrong result for 'isReachableRecursive(${from.name}, ${to.name})' in $cities", result,
                isReachableRecursive(from, to))
    }

    private fun checkIterative(cities: List<City>, from: City, to: City, result: Boolean) {
        Assert.assertEquals("Wrong result for 'isReachableRecursive(${from.name}, ${to.name})' in $cities", result,
                isReachableIterative(from, to))
    }

    @Test
    fun test1Sample() {
        val dublin = City("Dublin")
        val liverpool = City("Liverpool")
        val manchester = City("Manchester")
        val leeds = City("Leeds")

        addConnection(liverpool, manchester)
        addConnection(manchester, leeds)

        checkRecursiveSample(liverpool, leeds, true)
        checkRecursiveSample(liverpool, dublin, false)
        checkIterativeSample(liverpool, leeds, true)
        checkIterativeSample(liverpool, dublin, false)
    }

    @Test
    fun test2() {
        val cities = (0..4).map { City("City$it") }

        addConnections(cities, 0 to 1, 1 to 2, 2 to 3, 3 to 4)

        checkRecursive(cities, cities[0], cities[4], true)
        checkIterative(cities, cities[0], cities[4], true)
    }

    @Test
    fun test3() {
        val cities = (0..1).map { City("City$it") }
        addConnections(cities)

        checkRecursive(cities, cities[0], cities[1], false)
        checkIterative(cities, cities[0], cities[1], false)
    }

    private fun addConnections(cities: List<City>, vararg pairs: Pair<Int, Int>) {
        pairs.forEach {
            addConnection(cities[it.first], cities[it.second])
        }
    }

    @Test
    fun test4() {
        val cities = (0..9).map { City("City$it") }
        addConnections(cities, 1 to 2, 2 to 4, 4 to 5, 1 to 3, 3 to 6, 3 to 7, 8 to 9)

        checkRecursive(cities, cities[1], cities[5], true)
        checkRecursive(cities, cities[1], cities[8], false)
        checkIterative(cities, cities[1], cities[5], true)
        checkIterative(cities, cities[1], cities[8], false)
    }
}