package secondaryConstructorsExercise2

import org.junit.Test
import util.checkParametersOfConstructor
import util.loadClass
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.test.assertTrue

class TestSecondaryConstructorsExercise2 {

    @Test
    fun `test constructors structure`() {
        val actualClass = loadClass("secondaryConstructorsExercise2", SpaceShip::class.simpleName!!)

        with(actualClass) {
            assertTrue(
                    actual = actualClass.constructors.size >= 3,
                    message = "Class $simpleName has fewer constructors than required by conditions"
            )
        }

        actualClass
                .findConstructorBySignatureSize(1)
                .also { actualConstructor ->
                    checkParametersOfConstructor(actualConstructor, actualClass,
                            listOf(
                                    "name" to "kotlin.String"
                            )
                    )
                }

        actualClass
                .findConstructorBySignatureSize(2)
                .also { actualConstructor ->
                    checkParametersOfConstructor(actualConstructor, actualClass,
                            listOf(
                                    "name" to "kotlin.String",
                                    "shipClass" to "kotlin.String"
                            )
                    )
                }

        actualClass
                .findConstructorBySignatureSize(3)
                .also { actualConstructor ->
                    checkParametersOfConstructor(actualConstructor, actualClass,
                            listOf(
                                    "name" to "kotlin.String",
                                    "shipClass" to "kotlin.String",
                                    "weight" to "kotlin.Int"
                            )
                    )
                }
    }

    private fun KClass<*>.findConstructorBySignatureSize(paramNumber: Int): KFunction<Any> {
        return constructors
                .firstOrNull { it.parameters.size == paramNumber }
                ?: throw AssertionError("Class $simpleName has no constructor with $paramNumber parameters")
    }
}
