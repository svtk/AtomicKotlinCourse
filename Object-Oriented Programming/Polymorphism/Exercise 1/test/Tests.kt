package polymorphismExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.assertConstructorNumber
import util.assertInheritance
import util.loadClass
import util.loadTraceContent
import kotlin.reflect.full.createInstance
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPolymorphismExercise1 {

    private val packageName = "polymorphismExercise1"

    @Test
    fun `#01 classes structure`() {
        loadClass(packageName, "Warrior").apply {
            assertConstructorNumber(1)
            assertInheritance(this, listOf("Character", "Fighter"))
        }
        loadClass(packageName, "Elf").apply {
            assertConstructorNumber(1)
            assertInheritance(this, listOf("Character", "Magician"))
        }
        loadClass(packageName, "FightingElf").apply {
            assertConstructorNumber(1)
            assertInheritance(this, listOf("Elf", "Fighter"))
        }
        loadClass(packageName, "Wizard").apply {
            assertConstructorNumber(1)
            assertInheritance(this, listOf("Character", "Magician", "Flyer"))
        }
        loadClass(packageName, "Dragon").apply {
            assertConstructorNumber(1)
            assertInheritance(this, listOf("Character", "Flyer"))
        }
    }

    @Test
    fun `#02 what do the characters`() {
        listOf("Warrior", "Elf", "FightingElf", "Dragon", "Wizard")
                .map { loadClass(packageName, it).createInstance() as Character }
                .forEach { c -> c.playTurn() }

        assertEquals(
                message = "Incorrect result of playTurn() for all characters",
                actual = loadTraceContent(),
                expected = listOf(
                        "Warrior: Fight!",
                        "Elf: Magic!",
                        "FightingElf: Magic!Fight!",
                        "Dragon: Fly!",
                        "Magician: Magic!Fly!"
                )
        )
    }
}
