package classDelegationExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestClassDelegationExercise1 {

  private val packageName = "classDelegationExercise1"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    val rectangleClass = loadClass("Rectangle").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("paint")
      assertDeclaredMemberFunction("resize")
    }
    loadClass("ButtonImage").apply {
      assertInheritance("Rectangle")
      assertDeclaredMemberProperty("width")
      assertDeclaredMemberProperty("height")
      assertDeclaredMemberFunction("paint")
      assertDeclaredMemberFunction("resize")
    }
    val mouseManagerClass = loadClass("MouseManager").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("clicked")
      assertDeclaredMemberFunction("hovering")
      assertDeclaredMemberFunction("rightClicked")
    }
    loadClass("UserInput").apply {
      assertInheritance("MouseManager")
      assertDeclaredMemberFunction("clicked")
      assertDeclaredMemberFunction("hovering")
      assertDeclaredMemberFunction("rightClicked")
    }

    loadClass("Button").apply {
      assertInheritance("Rectangle", "MouseManager")
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "width" to Int::class,
          "height" to Int::class,
          "image" to rectangleClass,
          "input" to mouseManagerClass
      )
      assertDeclaredMemberProperty("width")
      assertDeclaredMemberProperty("height")
      assertDeclaredMemberProperty("image")
      assertDeclaredMemberProperty("input")
    }
  }

  @Test
  fun `#02 button functioning`() {
    val buttonImageClass = loadClass("ButtonImage")
    val userInputClass = loadClass("UserInput")
    loadClass("Button").apply {
      val button = createInstance(
          10,
          5,
          buttonImageClass.createInstance(10, 5),
          userInputClass.createInstance()
      )
      assertEquals("painting ButtonImage(10, 5)", assertMemberFunction("paint").call(button))
      assertEquals(true, assertMemberFunction("clicked").call(button))
      assertEquals(true, assertMemberFunction("hovering").call(button))
      assertEquals(10, assertMemberFunction("resize").call(button, 10))
      assertEquals(true, assertMemberFunction("rightClicked").call(button))
    }
  }
}