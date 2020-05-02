package inheritanceExercise2

import inheritanceExercise1.Cleanser
import inheritanceExercise1.Detergent
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.test.assertEquals


@OptIn(ExperimentalStdlibApi::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInheritanceExercise2 {

    @Test
    fun `#01 classes structure`() {
        val cleanserClass = Cleanser::class
        cleanserClass.assertConstructorNumber(1)
        val optProperty = loadMemberProperty(cleanserClass, "ops")
        assertEquals(
                actual = optProperty.returnType.toString(),
                expected = "kotlin.collections.MutableList<kotlin.String>",
                message = "Invalid return type of the method"
        )
        loadMemberFunction(cleanserClass, "dilute")
        loadMemberFunction(cleanserClass, "apply")
        loadMemberFunction(cleanserClass, "scrub")
        assertNoMemberFunction(cleanserClass, "sterilize")

        val detergentClass = Detergent::class
        assertNoMemberFunction(detergentClass, "sterilize")

        val disinfectantClass = Disinfectant::class
        assertInheritance(disinfectantClass, detergentClass)
        loadMemberFunction(disinfectantClass, "sterilize")
    }

    @Test
    fun `#02 disinfectant methods application`() {
        val disinfectantClass = Disinfectant::class
        val instance = disinfectantClass.constructors.first().call()
        loadMemberFunction(disinfectantClass, "dilute").call(instance)
        loadMemberFunction(disinfectantClass, "apply").call(instance)
        loadMemberFunction(disinfectantClass, "scrub").call(instance)
        loadMemberFunction(disinfectantClass, "sterilize").call(instance)

        loadMemberProperty(disinfectantClass, "ops")
                .call(instance)
                .also { opt ->
                    assertEquals(
                            expected = listOf("dilute", "apply", "scrub", "sterilize"),
                            actual = opt as List<String>,
                            message = "Member property `opt` of class Disinfectant should contain list of methods " +
                                    "names after their invocation"
                    )
                }

    }
}
