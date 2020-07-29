package secondaryConstructorsExercise2

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecondaryConstructorsExercise2 {

  @Test
  fun `#01 constructors structure`() {
    val actualClass = loadClass("secondaryConstructorsExercise2", SpaceShip::class.simpleName!!)
    loadAssertedMemberProperty(actualClass, "name", String::class)
    actualClass.assertConstructorNumber(2)

    actualClass
        .findConstructorBySignatureSize(1)
        .also { actualConstructor ->
          actualClass.assertParametersOfConstructor(actualConstructor,
              "name" to String::class
          )
        }

    actualClass
        .findConstructorBySignatureSize(2)
        .also { actualConstructor ->
          actualClass.assertParametersOfConstructor(actualConstructor,
              "shipClass" to String::class,
              "model" to Int::class
          )
        }
  }

  @Test
  fun `#02 apply constructors`() {
    val actualClass = loadClass("secondaryConstructorsExercise2", SpaceShip::class.simpleName!!)
    val nameProp = loadAssertedMemberProperty(actualClass, "name", String::class)

    val spaceShip1 = actualClass.findConstructorBySignatureSize(1).call("SuperhighspeedShip")
    assertEquals(
        expected = "SuperhighspeedShip",
        actual = nameProp.getter.call(spaceShip1),
        message = "SpaceShip constructed as SpaceShip(\"SuperhighspeedShip\") should have a name 'SuperhighspeedShip'"
    )
    val spaceShip2 = actualClass.findConstructorBySignatureSize(2).call("MClass", 29321)
    assertEquals(
        expected = "MClass-29321",
        actual = nameProp.getter.call(spaceShip2),
        message = "SpaceShip constructed as SpaceShip(\"MClass\", 29321) should have a name 'MClass-29321'"
    )
  }

  private fun KClass<*>.findConstructorBySignatureSize(paramNumber: Int): KFunction<Any> {
    return constructors
        .firstOrNull { it.parameters.size == paramNumber }
        ?: throw AssertionError("Class $simpleName has no constructor with $paramNumber parameters")
  }
}
