package inheritanceAndExtensionsExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInheritanceAndExtensionsExercise1 {

  private val packageName = "inheritanceAndExtensionsExercise1"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    loadClass("Duck").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("quack")
      assertDeclaredMemberFunction("swim")
    }
    loadClass("RealDuck").apply {
      assertInheritance("Duck")
      assertDeclaredMemberFunction("quack")
      assertDeclaredMemberFunction("swim")
    }

    val crocodileClass = loadClass("Crocodile").apply {
      assertInterface()
      assertNoInheritance()
      assertDeclaredMemberFunction("bite")
    }
    loadClass("RealCrocodile").apply {
      assertInheritance("Crocodile")
      assertDeclaredMemberFunction("bite")
    }
    loadClass("IAmHonestlyDuck").apply {
      assertInheritance("Duck")
      assertDeclaredMemberProperty("crocodile", crocodileClass)
      assertDeclaredMemberFunction("quack")
      assertDeclaredMemberFunction("swim")
    }

    val fileFacade = loadFileFacade(packageName)
    loadToplevelFunction(fileFacade, "interactWithDuck")
    loadToplevelFunction(fileFacade, "interactWithCrocodile")
    loadToplevelFunction(fileFacade, "mimicDuck")
  }

  @Test
  fun `#02 ducks and crocodiles`() {
    val fileFacade = loadFileFacade(packageName)
    val interactWithDuck = loadToplevelFunction(fileFacade, "interactWithDuck")
    val interactWithCrocodile = loadToplevelFunction(fileFacade, "interactWithCrocodile")
    val mimicDuck = loadToplevelFunction(fileFacade, "mimicDuck")

    val honestlyDuck = mimicDuck(null, loadClass("RealCrocodile")
        .createInstance())
    interactWithDuck(null, honestlyDuck)

    val crocodile = loadClass("IAmHonestlyDuck")
        .assertMemberProperty("crocodile")
        .call(honestlyDuck)
    interactWithCrocodile(null, crocodile)

    assertEquals(
        message = "Incorrect sequence of bites and panic",
        actual = loadTraceContent(),
        expected = listOf(
            "Mnom-mnom",
            "Mnom-mnom",
            "Panic!!!",
            "Mnom-mnom"
        )
    )
  }
}