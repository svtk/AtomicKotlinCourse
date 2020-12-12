package compositionExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCompositionExercise3 {

    private val packageName = "compositionExercise3"

    @Test
    fun `#01 queue structure`() {
        loadClass(packageName, "Queue").apply {
            assertConstructorNumber(1)
            assertParametersOfFirstConstructor()
            assertMemberFunction("put")
            assertMemberFunction("poll")
            assertNoMemberFunction("get")
        }
    }

    @Test
    fun `#02 queue functioning`() {
        val queueClass = loadClass(packageName, "Queue")
        val queue = queueClass.createInstance()
        val add = loadMemberFunction(queueClass, "put")
        val poll = loadMemberFunction(queueClass, "poll")
        add.call(queue, "a")
        add.call(queue, "b")
        add.call(queue, "c")
        add.call(queue, "d")
        assertEquals(
            message = "First call of poll() in {'a','b','c','d'} queue should return 'a'",
            expected = "a",
            actual = poll.call(queue))
        assertEquals(
            message = "Second call of poll() in {'a','b','c','d'} queue should return 'b'",
            expected = "b",
            actual = poll.call(queue)
        )
    }
}