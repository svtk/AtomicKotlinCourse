package memberReferencesExercise1

import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import util.loadClass
import util.loadFileFacade
import util.loadToplevelFunction
import kotlin.reflect.KFunction
import kotlin.test.assertEquals

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMemberReferencesExercise1 {

    private val landPets = listOf(
            Pet("Dog", Habitat.LAND),
            Pet("Cat", Habitat.LAND)
    )
    private val noLandPets = listOf(
            Pet("Goldfish", Habitat.WATER),
            Pet("Turtle", Habitat.AMPHIBIOUS),
            Pet("Frog", Habitat.AMPHIBIOUS)
    )
    private val allPets = (noLandPets + landPets)
    private val amphibious = noLandPets.subList(1, 3)
    private val emptyPets = emptyList<Pet>()

    @Test
    fun `#01 classes and method names`() {
        loadClass("memberReferencesExercise1", "Habitat")
        loadClass("memberReferencesExercise1", "Pet")
        loadToplevelFunction(loadFileFacade("memberReferencesExercise1"), "liveOnLand")
        loadToplevelFunction(loadFileFacade("memberReferencesExercise1"), "liveInWater")
        loadToplevelFunction(loadFileFacade("memberReferencesExercise1"), "areAmphibious")
        loadToplevelFunction(loadFileFacade("memberReferencesExercise1"), "partitionAmphibious")
    }

    @Test
    fun `#02 live on land`() {
        assertFiltering(emptyPets, emptyPets, List<Pet>::liveOnLand)
        assertFiltering(landPets, landPets, List<Pet>::liveOnLand)
        assertFiltering(noLandPets, emptyPets, List<Pet>::liveOnLand)
        assertFiltering(allPets, landPets, List<Pet>::liveOnLand)
    }

    @Test
    fun `#03 live in water`() {
        val waterPets = noLandPets.subList(0, 1)
        assertFiltering(emptyPets, emptyPets, List<Pet>::liveInWater)
        assertFiltering(landPets, emptyPets, List<Pet>::liveInWater)
        assertFiltering(noLandPets, waterPets, List<Pet>::liveInWater)
        assertFiltering(allPets, waterPets, List<Pet>::liveInWater)
    }

    @Test
    fun `#04 are amphibious`() {
        assertFiltering(emptyPets, emptyPets, List<Pet>::areAmphibious)
        assertFiltering(landPets, emptyPets, List<Pet>::areAmphibious)
        assertFiltering(noLandPets, amphibious, List<Pet>::areAmphibious)
        assertFiltering(allPets, amphibious, List<Pet>::areAmphibious)
    }

    private fun assertFiltering(
            initial: List<Pet>,
            expected: List<Pet>,
            kFunction: KFunction<List<Pet>>
    ) {
        assertEquals(
                expected = expected.toSet(),
                actual = kFunction.call(initial).toSet(),
                message = "Wrong result for '${kFunction.name}()' called on $initial:"
        )
    }

    @Test
    fun `#05 partition amphibious`() {
        assertPartition(emptyPets, expected = emptyPets to emptyPets)
        assertPartition(landPets, expected = emptyPets to landPets)
        assertPartition(noLandPets, expected = amphibious to noLandPets.subList(0, 1))
        assertPartition(allPets, expected = amphibious to (landPets + noLandPets.subList(0, 1)))
    }

    private fun assertPartition(
            initial: List<Pet>,
            expected: Pair<List<Pet>, List<Pet>>
    ) {
        assertEquals(
                expected = expected.let { (pos, neg) -> pos.toSet() to neg.toSet() },
                actual = initial.partitionAmphibious().let { (pos, neg) -> pos.toSet() to neg.toSet() },
                message = "Wrong result for 'partitionAmphibious()' called on $initial:"
        )
    }
}
