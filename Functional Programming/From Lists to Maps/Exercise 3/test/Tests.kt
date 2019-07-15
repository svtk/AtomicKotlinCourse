package fromListstoMaps03

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import kotlin.collections.associateBy as associateByLibrary

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPersonsMap {
    private fun <T, R> check(
            list: List<T>,
            keySelector: (T) -> R,
            keySelectorStr: String
    ) {
        Assert.assertEquals("Wrong result for $list associated by $keySelectorStr",
                list.associateByLibrary(keySelector),
                list.associateBy(keySelector))
    }

    @Test
    fun test1Sample() = check(listOf(Person("Alice", 21),
            Person("Bob", 25), Person("Charlie", 25)),
            Person::age, "Person::age")

    @Test
    fun test2() = check(listOf("abc", "ahh", "never"),
            { it.first() }, "{ it.first() }")

    @Test
    fun test3() = check((1..5).toList(), { it }, "{ it }")

    @Test
    fun test4() = check(listOf(Person("Alice", 21),
            Person("Bob", 25), Person("Charlie", 25)),
            Person::name, "Person::name")
}