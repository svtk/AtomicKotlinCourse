package compositionExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCompositionExercise2 {

  private val packageName = "compositionExercise2"

  @Test
  fun `#01 stack structure`() {
    loadClass(packageName, "Stack").apply {
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor()
      loadMemberFunction(this, "push")
      loadMemberFunction(this, "pop")
      assertNoMemberFunction("get")
    }
  }

  @Test
  fun `#02 stack functioning`() {
    val stackClass = loadClass(packageName, "Stack")
    val stack = stackClass.createInstance()
    val push = loadMemberFunction(stackClass, "push")
    val pop = loadMemberFunction(stackClass, "pop")
    push.call(stack, 1)
    push.call(stack, 2)
    push.call(stack, 3)
    push.call(stack, 4)
    assertEquals(
        message = "First call of pop() in {1, 2, 3, 4} stack should return 4",
        expected = 4,
        actual = pop.call(stack)
    )
    assertEquals(
        message = "Second call of pop() in {1, 2, 3, 4} stack should return 3",
        expected = 3,
        actual = pop.call(stack)
    )
  }

  @Test
  fun `#03 queue structure`() {
    loadClass(packageName, "Queue").apply {
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor()
      loadMemberFunction(this, "put")
      loadMemberFunction(this, "poll")
      assertNoMemberFunction("get")
    }
  }

  @Test
  fun `#04 queue functioning`() {
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