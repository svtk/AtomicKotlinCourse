package inheritanceAndExtensionsExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInheritanceAndExtensionsExercise2: TestTrace() {

  private val packageName = "inheritanceAndExtensionsExercise2"

  private fun loadClass(className: String): KClass<*> = loadClass(packageName, className)

  @Test
  fun `#01 classes structure`() {
    val dogClass = loadClass("Dog").apply {
      assertOpen()
      assertNoInheritance()
      assertDeclaredMemberFunction("speak")
      assertDeclaredMemberFunction("sit")
    }
    val realDogClass = loadClass("RealDog").apply {
      assertOpen()
      assertInheritance("Dog")
      assertDeclaredMemberFunction("feed")
    }
    val toyDogClass = loadClass("ToyDog").apply {
      assertInheritance("Dog")
      assertDeclaredMemberFunction("speak")
      assertDeclaredMemberFunction("changeBatteries")
    }

    val fileFacade = loadFileFacade(packageName)
    loadToplevelFunction(fileFacade, "play", dogClass)
    loadToplevelFunction(fileFacade, "play", realDogClass)
    loadToplevelFunction(fileFacade, "play", toyDogClass)
  }

  @Test
  fun `#02 play with toy dog`() {
    val fileFacade = loadFileFacade(packageName)
    val dogClass = loadClass("Dog")
    val toyDogClass = loadClass("ToyDog")
    val play = loadToplevelFunction(fileFacade, "play", dogClass)
    play.invoke(null, toyDogClass.createInstance())

    assertEquals(
        message = "Incorrect sequence of bites and panic",
        actual = loadTraceContent(),
        expected = listOf(
            "b.a.r.k.",
            "Sitting..."
        )
    )
  }
}