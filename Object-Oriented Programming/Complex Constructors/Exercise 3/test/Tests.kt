package complexConstructorsExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertConstructorNumber
import util.checkParametersOfConstructor
import util.loadClass
import util.loadMemberProperty
import kotlin.reflect.full.memberProperties
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestComplexConstructorsExercise3 {

    @Test
    fun `#01 MultipleInit class structure`() {
        val multipleInitClass = loadClass("complexConstructorsExercise3", "MultipleInit")
        multipleInitClass.assertConstructorNumber(1)
        val multipleInitConstructor = multipleInitClass.constructors.first()
        checkParametersOfConstructor(multipleInitConstructor, multipleInitClass, emptyList())
        loadMemberProperty(multipleInitClass, "initOrder")
    }

    @Test
    fun `#02 MultipleInit initialisation block`() {
        val multipleInitClass = loadClass("complexConstructorsExercise3", "MultipleInit")
        val multipleInitInstance = multipleInitClass.constructors.first().call()
        assertEquals(
                expected = listOf("one", "two", "three"),
                actual = multipleInitClass.memberProperties.firstOrNull { it.name == "initOrder" }?.call(multipleInitInstance),
                message = "MultipleInit member property 'initOrder' should be equal to '[one, two, three]' after initialisation"
        )
    }
}
