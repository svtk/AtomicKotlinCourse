package baseClassInitializationExercise3
import atomictest.trace
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBaseClassInitializationExercise3 {

  private val packageName = "baseClassInitializationExercise3"

  @Test
  fun `#01 classes structure`() {
    loadClass(packageName, "Animal").apply {
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "sound" to String::class
      )
      assertMemberProperty("sound", String::class)
    }
    loadClass(packageName, "Cat").apply {
      assertInheritance("Animal")
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "sound" to String::class
      )
      assertNoDeclaredMemberProperty("sound")
    }
    loadClass(packageName, "Dog").apply {
      assertInheritance("Animal")
      assertConstructorNumber(1)
      assertParametersOfFirstConstructor(
          "sound" to String::class
      )
      assertNoDeclaredMemberProperty("sound")
    }
  }

  @Test
  fun `#02 animal sounds`() {
    loadClass(packageName, "Animal").apply {
      val animal = createInstance()
      val sound = loadMemberProperty(this, "sound").call(animal) as String
      trace(sound)
    }
    loadClass(packageName, "Cat").apply {
      val cat = createInstance()
      val sound = loadMemberProperty(this, "sound").call(cat) as String
      trace(sound)
    }
    loadClass(packageName, "Dog").apply {
      val dog = createInstance()
      val sound = loadMemberProperty(this, "sound").call(dog) as String
      trace(sound)
    }

    assertEquals(
        message = "Incorrect animal sounds",
        actual = loadTraceContent(),
        expected = listOf(
            "???",
            "meow",
            "woof"
        )
    )
  }
}