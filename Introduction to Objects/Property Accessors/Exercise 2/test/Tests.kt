package propertyAccessors2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestNumberOfAccesses {
    @Test
    fun test1Sample() {
        val strange = Strange()
        Assert.assertEquals("'strange.accesses' should increment the value on each access",
                listOf(1, 2, 3),
                listOf(strange.accesses, strange.accesses, strange.accesses))
    }

    @Test
    fun test2More() {
        val strange = Strange()
        Assert.assertEquals("'strange.accesses' should increment the value on each access",
                listOf(1, 2, 3, 4, 5, 6),
                listOf(strange.accesses, strange.accesses, strange.accesses,
                        strange.accesses, strange.accesses, strange.accesses))
    }

    private fun checkRepeat(n: Int) {
        val strange = Strange()
        repeat(n) {
            strange.accesses
        }
        Assert.assertEquals("Incorrect result after repeating 'strange.accesses' for $n times;" +
                "Should be ${n + 1} on the next access: ",
                n + 1,
                strange.accesses)
    }

    @Test
    fun test3Repeat() = checkRepeat(10)

    @Test
    fun test4Repeat() = checkRepeat(100)
}