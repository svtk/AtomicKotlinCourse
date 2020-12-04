package upcastingExercise2
import atomictest.trace
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestUpcastingExercise2: TestTrace() {

  private val packageName = "upcastingExercise2"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    loadClass("Apple").apply {
      assertInterface()
      assertDeclaredMemberFunction("consume")
    }

    listOf("GrannySmith", "Gala", "Fuji", "Braeburn").forEach {
      loadClass(it).apply {
        assertAbstract(expected = false)
        assertInheritance("Apple")
        assertDeclaredMemberFunction("consume")
      }
    }
  }

  @Test
  fun `#02 consume apples`() {
    listOf("GrannySmith", "Gala", "Fuji", "Braeburn").forEach {
      loadClass("Apple").apply {
        val consume = assertDeclaredMemberFunction("consume")
        val apple = loadClass(it).createInstance()
        trace(consume.call(apple) as String)
      }
    }

    assertEquals(
        message = "Incorrect sequence of actions applied to the apples",
        actual = loadTraceContent(),
        expected = listOf(
            "chomp GrannySmith",
            "bite Gala",
            "press Fuji",
            "peel Braeburn"
        )
    )
  }
}