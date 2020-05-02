package inheritanceExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertConstructorNumber
import util.assertInheritance
import util.loadMemberFunction
import util.loadMemberProperty
import kotlin.test.assertEquals

@OptIn(ExperimentalStdlibApi::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInheritanceExercise1 {

    @Test
    fun `#01 classes structure`() {
        val cleanserClass = Cleanser::class
        cleanserClass.assertConstructorNumber(1)
        val optProperty = loadMemberProperty(cleanserClass, "ops")
        assertEquals(
                actual = optProperty.returnType.toString(),
                expected = "kotlin.collections.MutableList<kotlin.String>",
                message = "Property 'ops' should have the type MutableList<String>"
        )
        loadMemberFunction(cleanserClass, "dilute")
        loadMemberFunction(cleanserClass, "apply")
        loadMemberFunction(cleanserClass, "scrub")

        val detergentClass = Detergent::class
        assertInheritance(detergentClass, cleanserClass)
    }

    @Test
    fun `#02 detergent methods application`() {
        val detergentClass = Detergent::class
        val instance = detergentClass.constructors.first().call()
        loadMemberFunction(detergentClass, "dilute").call(instance)
        loadMemberFunction(detergentClass, "apply").call(instance)
        loadMemberFunction(detergentClass, "scrub").call(instance)

        loadMemberProperty(detergentClass, "ops")
                .call(instance)
                .also { opt ->
                    assertEquals(
                            expected = listOf("dilute", "apply", "scrub"),
                            actual = opt as List<String>,
                            message = "Member property `opt` of class Detergent should contain list of methods " +
                                    "names after their invocation"
                    )
                }

    }
}
