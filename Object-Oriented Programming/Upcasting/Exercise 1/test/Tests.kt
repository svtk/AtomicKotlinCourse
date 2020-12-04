package upcastingExercise1
import atomictest.trace
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestUpcastingExercise1: TestTrace() {

  private val packageName = "upcastingExercise1"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    loadClass("Rodent").apply {
      assertInterface()
      assertDeclaredMemberFunction("eat")
      assertDeclaredMemberFunction("speak")
    }

    loadClass("Mouse").apply {
      assertAbstract(expected = false)
      assertInheritance("Rodent")
      assertDeclaredMemberFunction("eat")
      assertDeclaredMemberFunction("speak")
    }

    loadClass("KangarooRat").apply {
      assertAbstract(expected = false)
      assertInheritance("Rodent")
      assertDeclaredMemberFunction("eat")
      assertDeclaredMemberFunction("speak")
      assertDeclaredMemberFunction("jump")
    }

    loadToplevelFunction(loadFileFacade(packageName), "upcast")
  }

  @Test
  fun `#02 rodents actions`() {
    val mouse = loadClass("Mouse").createInstance()
    val kangarooRat = loadClass("KangarooRat").createInstance()
    val upcast = loadToplevelFunction(loadFileFacade(packageName), "upcast")
    val jump = loadClass("KangarooRat").assertDeclaredMemberFunction("jump")

    trace(jump.call(kangarooRat))
    upcast(null, mouse)
    upcast(null, kangarooRat)

    assertEquals(
        message = "Incorrect sequence of actions of rodents",
        actual = loadTraceContent(),
        expected = listOf(
            "KangarooRat.jump",
            "Mouse.eat",
            "Mouse.speak",
            "KangarooRat.eat",
            "KangarooRat.speak"
        )
    )
  }
}