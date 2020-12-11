package abstractClassesExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAbstractClassesExercise1 : TestTrace() {

  private val packageName = "abstractClassesExercise1"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    loadClass("Shape").apply {
      assertAbstract()
      loadMemberFunction(this, "draw").apply {
        assertAbstract()
      }
      loadMemberFunction(this, "erase").apply {
        assertAbstract()
      }
    }
    listOf("Circle", "Square", "Triangle").forEach {
      loadClass(it).apply {
        assertDeclaredMemberFunction("draw")
        assertDeclaredMemberFunction("erase")
      }
    }
  }

  @Test
  fun `#02 shape operations`() {
    val (draw, erase) = loadClass("Shape").let {
      loadMemberFunction(it, "draw") to loadMemberFunction(it, "erase")
    }
    val shapes = listOf("Circle", "Square", "Triangle").map {
      loadClass(it).createInstance()
    }
    shapes.forEach { draw.call(it) }
    shapes.forEach { erase.call(it) }

    assertEquals(
        message = "Incorrect result of trace for draw/erase operations",
        actual = loadTraceContent(),
        expected = listOf(
            "Draw Circle",
            "Draw Square",
            "Draw Triangle",
            "Erase Circle",
            "Erase Square",
            "Erase Triangle"
        )
    )
  }
}