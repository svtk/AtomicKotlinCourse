package compositionExercise1
import atomictest.trace
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestCompositionExercise1: TestTrace() {

  private val packageName = "compositionExercise1"

  @Test
  fun `#01 classes structure`() {
    loadClass(packageName, "Shape").apply {
      loadMemberProperty(this, "name")
      loadMemberProperty(this, "color")
      loadMemberFunction(this, "draw")
    }

    loadClass(packageName, "Circle").apply {
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "radius" to Int::class,
          "color" to String::class
      )
      assertInheritance("Shape")
    }
    loadClass(packageName, "Rectangle").apply {
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "height" to Int::class,
          "width" to Int::class,
          "color" to String::class
      )
      assertInheritance("Shape")
    }
  }

  @Test
  fun `#02 how are the shapes drawn`() {
    loadClass(packageName, "Circle").also { circleClass ->
      circleClass.constructors.first()
          .call(10, "red")
          .let { loadMemberFunction(circleClass, "draw").call(it) }
          .also { trace(it as String) }
    }

    loadClass(packageName, "Rectangle").also { rectangleClass ->
      rectangleClass.constructors.first()
          .call(3, 4, "blue")
          .let { loadMemberFunction(rectangleClass, "draw").call(it) }
          .also { trace(it as String) }
    }

    assertEquals(
        message = "Incorrect result of shapes drawing",
        actual = loadTraceContent(),
        expected = listOf(
            "drawing red circle of radius 10",
            "drawing blue rectangle of size 3x4"
        )
    )
  }
}