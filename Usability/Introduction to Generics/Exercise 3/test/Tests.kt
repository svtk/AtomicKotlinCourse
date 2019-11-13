package introductionToGenericsExercise3

import org.junit.Assert
import org.junit.Test
import util.loadClass
import util.loadMemberFunction
import kotlin.reflect.full.createInstance

class TestIntroductionToGenericsExercise3 {
    private fun <T> testCountingSet(list: List<T>, notPresent: List<T>) {
        val countingSetClass = loadClass("introductionToGenericsExercise3", "CountingSet")
        val addFunc = loadMemberFunction(countingSetClass, "add")
        val countFunc = loadMemberFunction(countingSetClass, "count")
        val toSetFunc = loadMemberFunction(countingSetClass, "toSet")

        val cs = countingSetClass.createInstance()
        for (element in list) {
            addFunc.call(cs, element)
        }
        for (element in list) {
            val counter = countFunc.call(cs, element)
            Assert.assertEquals("Wrong 'count' result for '$element' in $list",
              list.count { element == it }, counter)
        }
        for (notElement in notPresent) {
            val counter = countFunc.call(cs, notElement)
            Assert.assertEquals("Wrong 'count' result for '$notElement' in $list",
              0, counter)
        }
        Assert.assertEquals("Wrong result for 'toSet' for $list",
          list.toSet(), toSetFunc.call(cs))
    }

    @Test
    fun test1() = testCountingSet(listOf("abc", "abc", "def"), listOf("xyz"))

    @Test
    fun test2() = testCountingSet(listOf(1, 1, 4, 2, 7, 7, 7), listOf(5, 6, 8))

    @Test
    fun test3() = testCountingSet(listOf('a', 'b', 'c', 'b', 'a'), listOf('d', 'e'))
}