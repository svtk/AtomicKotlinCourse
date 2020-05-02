package inheritanceExercise3

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertConstructorNumber
import util.assertInheritance
import util.loadMemberProperty
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestInheritanceExercise3 {

    @Test
    fun `#01 classes structure`() {
        val aClass = Game::class
        val bClass = BoardGame::class
        val cClass = Chess::class

        aClass.assertConstructorNumber(1)
        bClass.assertConstructorNumber(1)
        cClass.assertConstructorNumber(1)

        assertInheritance(bClass, aClass)
        assertInheritance(cClass, bClass)

        val optProperty = loadMemberProperty(aClass, "initOrder")
        assertEquals(
                actual = optProperty.returnType.toString(),
                expected = "kotlin.collections.MutableList<kotlin.String>",
                message = "Property 'initOrder' should have the type MutableList<String>"
        )
    }

    @Test
    fun `#02 initialisation order`() {
        val cClass = Chess::class
        val instance = cClass.constructors.first().call()

        loadMemberProperty(cClass, "initOrder")
                .call(instance)
                .also { opt ->
                    assertEquals(
                            expected = listOf("Game", "BoardGame", "Chess"),
                            actual = opt as List<String>,
                            message = "Member property `initOrder` of class Chess should be equal to " +
                                    "[\"Game\", \"BoardGame\", \"Chess\""
                    )
                }

    }
}
