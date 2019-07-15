package memberReferences02

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
    @Test
    fun test1Sample() {
        val range = 1..1000
        val even = range.filter(/*<taskWindow>*/Int::isEven/*</taskWindow>*/)
        Assert.assertEquals("Wrong result for `even` collection:", 500, even.size)

        val prime = range.filter(/*<taskWindow>*/Int::isPrime/*</taskWindow>*/)
        Assert.assertEquals("Wrong result for `prime` collection:",
                listOf(953, 967, 971, 977, 983, 991, 997), prime.takeLast(7))

        val perfect = range.filter(/*<taskWindow>*/::isPerfect/*</taskWindow>*/)
        Assert.assertEquals("Wrong result for `perfect` collection:",
                listOf(6, 28, 496), perfect)

    }

    private fun testPrime(i: Int, isPrime: Boolean) {
        Assert.assertEquals("The number $i ${if (isPrime) "should" else "shouldn't"} be prime", isPrime, i.isPrime())
    }

    @Test
    fun test2Prime() {
        testPrime(2, true)
        testPrime(5, true)
        testPrime(1861, true)
        testPrime(2399, true)
        testPrime(5569, true)
        testPrime(6737, true)
        testPrime(12007, true)

        testPrime(1, false)
        testPrime(10, false)
        testPrime(2397, false)
        testPrime(6739, false)
    }

    @Test
    fun test3Perfect() {
        val i = 8128
        Assert.assertTrue("The number $i should be perfect", isPerfect(i))
    }
}