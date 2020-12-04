package baseClassInitializationExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBaseClassInitializationExercise2 : TestTrace() {

  private val packageName = "baseClassInitializationExercise2"

  @Test
  fun `#01 classes structure`() {
    loadClass(packageName, "DinnerPlate").apply {
      assertInheritance("Plate")
    }
    loadClass(packageName, "Spoon").apply {
      assertInheritance("Utensil")
    }
    loadClass(packageName, "Fork").apply {
      assertInheritance("Utensil")
    }
    loadClass(packageName, "Knife").apply {
      assertInheritance("Utensil")
    }
    loadClass(packageName, "PlaceSetting").apply {
      assertInheritance("Custom")
    }
  }

  @Test
  fun `#02 initialisation`() {
    loadClass(packageName, "PlaceSetting").createInstance()
    assertEquals(
        message = "Incorrect result of PlaceSetting initialisation",
        actual = loadTraceContent(),
        expected = listOf(
            "Custom",
            "Utensil-Spoon",
            "Utensil-Fork",
            "Utensil-Knife",
            "Plate-DinnerPlate",
            "PlaceSetting"
        )
    )
  }
}