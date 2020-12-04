package upcastingExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestUpcastingExercise3: TestTrace() {

  private val packageName = "upcastingExercise3"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    loadClass("Fighter").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("fight")
    }
    loadClass("Swimmer").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("swim")
    }
    loadClass("Flyer").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("fly")
    }
    loadClass("ActionCharacter").apply {
      assertOpen()
      assertNoInheritance()
      assertDeclaredMemberFunction("fight")
    }

    loadClass("Hero").apply {
      assertInheritance("ActionCharacter", "Fighter", "Swimmer", "Flyer")
      assertDeclaredMemberFunction("swim")
      assertDeclaredMemberFunction("fly")
    }

    val fileFacade = loadFileFacade(packageName)
    listOf("tryFight", "trySwim", "tryFly", "doAction").forEach {
      loadToplevelFunction(fileFacade, it)
    }
  }

  @Test
  fun `#02 hero actions`() {
    val fileFacade = loadFileFacade(packageName)
    val hero = loadClass("Hero").createInstance()
    listOf("tryFight", "trySwim", "tryFly", "doAction").map {
      val action = loadToplevelFunction(fileFacade, it)
      action.invoke(null, hero)
    }

    assertEquals(
        message = "Incorrect sequence of actions applied to the apples",
        actual = loadTraceContent(),
        expected = listOf(
            "ActionCharacter fight",
            "Hero swim",
            "Hero fly",
            "ActionCharacter fight"
        )
    )
  }
}