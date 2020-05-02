package secondaryConstructorsExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.assertConstructorNumber
import util.loadAssertedMemberProperty

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecondaryConstructorsExercise3 {

  @Test(timeout = TIMEOUT)
  fun `class structure`() {
    val gardenItemClass = GardenItem::class
    gardenItemClass.assertConstructorNumber(1)
    loadAssertedMemberProperty(gardenItemClass, "name", String::class)
    loadAssertedMemberProperty(gardenItemClass, "material", Material::class)
  }
}
