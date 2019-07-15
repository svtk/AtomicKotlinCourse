package functionTypes3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.mapIndexedNotNull as mapIndexedNotNullLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapIndexedNotNullImpl {
    private fun <T, R : Any> check(
            list: List<T>,
            predicateStr: String,
            predicate: (Int, T) -> R?
    ) {
        Assert.assertEquals("Wrong result for $list\n" +
                "predicate = $predicateStr",
                list.mapIndexedNotNull(predicate),
                list.mapIndexedNotNullLibrary(predicate))
    }

    @Test
    fun test1Sample() = check(listOf(1, 2, 3), "{ index, e -> \"\$index: \$e!\" }") { index, e -> "$index: $e!" }

    @Test
    fun test2() = check(listOf("1", "2", "3"), "{ index, e -> index + e.toInt() }") { index, e -> index + e.toInt() }

    @Test
    fun test3() = check(listOf("1", "2", "d"),
            """
            {
                index, e ->
                val i = e.toIntOrNull()
                if (i == null) null else index * i
            }""".replaceIndent()
    ) { index, e ->
        val i = e.toIntOrNull()
        if (i == null) null else index * i
    }
}