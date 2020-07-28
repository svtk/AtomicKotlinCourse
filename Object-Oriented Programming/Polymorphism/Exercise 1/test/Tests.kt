package polymorphismExercise1

import atomictest.Trace
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.*
import kotlin.reflect.full.createInstance
import kotlin.reflect.jvm.isAccessible
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

        val fileFacade = loadFileFacade(packageName)
        val trace: Trace = loadToplevelField(fileFacade, "trace")
                .apply { isAccessible = true }
                .let { it.get(null) as Trace }
        val actualContent = Trace::class.members
                .first { it.name == "content" }
                .apply { isAccessible = true }
                .let { it.call(trace) as List<String> }
        assertEquals(
                message = "Incorrect result of playTurn() for all characters",
                actual = actualContent,
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
