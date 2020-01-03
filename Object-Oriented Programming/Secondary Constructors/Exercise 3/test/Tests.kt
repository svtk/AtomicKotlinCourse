package secondaryConstructorsExercise3

import org.junit.Assert
import org.junit.Test
import util.TIMEOUT

class TestSecondaryConstructorsExercise3 {
  @Test(timeout = TIMEOUT)
  fun test() {
    Assert.assertEquals("GardenItem class should define only one constructor",
      1,
      GardenItem::class.constructors.size)
  }
}