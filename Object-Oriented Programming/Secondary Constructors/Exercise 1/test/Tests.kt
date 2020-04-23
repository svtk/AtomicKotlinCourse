package secondaryConstructorsExercise1

import org.junit.Assert
import org.junit.Test
import util.loadMemberProperty
import kotlin.test.assertEquals

class TestSecondaryConstructorsExercise1 {
    @Test fun testFlower1() {
        val flowerClass = Flower1::class
        val typeProp = loadMemberProperty(flowerClass, "type")
        val constructor = flowerClass.constructors.find { it.parameters.isEmpty() }
                ?: throw AssertionError("Can't find constructor without parameters in the class 'Flower1'")
        val flowerInstance = constructor.call()
        val typeValue = typeProp.getter.call(flowerInstance)

        assertEquals("Daisy", typeValue, "After calling a constructor without parameters the value of 'type' should be 'Daisy'")
    }

    @Test fun testFlower2() {
        //TODO: implement tests for Flower2 after description was slightly updated
        Assert.assertTrue("Tests not implemented for the task", false)
    }
}