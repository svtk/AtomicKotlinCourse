package secondaryConstructorsExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertConstructorNumber
import util.loadMemberProperty
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestSecondaryConstructorsExercise1 {

    @Test
    fun `#01 flower1 constructing`() {
        val flowerClass = Flower1::class
        val typeProp = loadMemberProperty(flowerClass, "type")
        flowerClass.assertConstructorNumber(2)
        val constructor = flowerClass.constructors.find { it.parameters.isEmpty() }
                ?: throw AssertionError("Can't find constructor without parameters in the class 'Flower1'")
        val flowerInstance = constructor.call()
        val typeValue = typeProp.getter.call(flowerInstance)

        assertEquals(
                expected = "Daisy",
                actual = typeValue,
                message = "After calling a constructor without parameters the value of 'type' should be 'Daisy'"
        )
    }

    @Test
    fun `#02 flower2 constructing`() {
        val flowerClass = Flower2::class
        val typeProp = loadMemberProperty(flowerClass, "type")
        flowerClass.assertConstructorNumber(1)
        val constructor = flowerClass.constructors.first()
        val flowerInstance = constructor.callBy(mapOf())
        val typeValue = typeProp.getter.call(flowerInstance)

        assertEquals(
                expected = "Daisy",
                actual = typeValue,
                message = "After calling a constructor without parameters the value of 'type' should be 'Daisy'"
        )
    }
}
