package secondaryConstructorsExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.TIMEOUT
import util.assertConstructorNumber
import util.assertMemberProperty

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecondaryConstructorsExercise3 {

  @Test(timeout = TIMEOUT)
  fun `class structure`() {
    GardenItem::class.apply {
      assertConstructorNumber(1)
      assertMemberProperty("name", String::class)
      assertMemberProperty("material", Material::class)
    }
  }
}
