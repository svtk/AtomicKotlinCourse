package abstractClassesExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestAbstractClassesExercise1 {

  private val packageName = "abstractClassesExercise1"

  @Test
  fun `#01 classes structure`() {
    loadClass(packageName, "Shape").apply {
      assertEquals(
          message = "Class should have modifier 'abstract'",
          expected = true,
          actual = isAbstract
      )
      loadMemberFunction(this, "draw").apply {
        assertEquals(
            message = "Method 'draw()' should have modifier 'abstract'",
            expected = true,
            actual = isAbstract
        )
      }
      loadMemberFunction(this, "erase").apply {
        assertEquals(
            message = "Method 'erase()' should have modifier 'abstract'",
            expected = true,
            actual = isAbstract
        )
      }
    }
    listOf("Circle", "Square", "Triangle").forEach {
      loadClass(packageName, it).apply {
        assertDeclaredMemberFunction("draw")
        assertDeclaredMemberFunction("erase")
      }
    }
  }

  @Test
  fun `#02 shape operations`() {
    val (draw, erase) = loadClass(packageName, "Shape").let {
      loadMemberFunction(it, "draw") to loadMemberFunction(it, "erase")
    }
    val shapes = listOf("Circle", "Square", "Triangle").map {
      loadClass(packageName, it).createInstance()
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