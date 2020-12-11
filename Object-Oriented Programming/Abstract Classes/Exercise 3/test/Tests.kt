package abstractClassesExercise3
import atomictest.trace
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAbstractClassesExercise3 : TestTrace() {

  private val packageName = "abstractClassesExercise3"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    loadClass("Instrument").apply {
      assertOpen()
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "name" to String::class,
          "action" to String::class,
      )
      assertDeclaredMemberProperty("name")
      assertDeclaredMemberProperty("action")
      assertDeclaredMemberFunction("play")
    }
    listOf("Wind", "Percussion", "Stringed").forEach {
      loadClass(it).apply {
        assertAbstract(expected = false)
        assertInheritance("Instrument")
        assertConstructorNumber(1)
        assertParametersOfFirstConstructor()
        assertNoDeclaredMemberFunction()
        assertNoDeclaredMemberProperty()
      }
    }
    loadToplevelFunction(loadFileFacade(packageName), "tune")
  }

  @Test
  fun `#02 sofa operations`() {
    val orchestra = listOf("Wind", "Percussion", "Stringed").map {
      loadClass(it).createInstance()
    }
    val tune = loadToplevelFunction(loadFileFacade(packageName), "tune")
    for (instrument in orchestra) {
      trace(tune.invoke(null, instrument))
    }

    assertEquals(
        message = "Incorrect tune of instruments",
        actual = loadTraceContent(),
        expected = listOf(
            "Wind blow C",
            "Percussion strike C",
            "Stringed pluck C"
        )
    )
  }
}