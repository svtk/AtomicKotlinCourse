package manipulatingLists5

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.flatMap as flatMapLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestFlatMap {
    private fun <T, R> checkFlatMap(
            list: List<T>,
            transform: (T) -> List<R>
    ) {
        Assert.assertEquals("Wrong 'flatMap' implementation",
                list.flatMapLibrary(transform),
                list.flatMap(transform))
    }

    @Test
    fun test1Sample() = checkFlatMap(listOf(3, 1, 4)) { (0..it).toList() }

    @Test
    fun test2() = checkFlatMap(listOf(10, 20, 30)) { listOf(it, it + 1, it + 2) }
}