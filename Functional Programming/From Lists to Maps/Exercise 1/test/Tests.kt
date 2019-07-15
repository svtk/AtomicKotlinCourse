package fromListstoMaps01

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestPersonsMap {
    private fun check(
            list: List<Person>
    ) {
        Assert.assertEquals("Wrong result for $list:",
                list.groupBy(Person::age).mapValues { (_, group) ->
                    group.map(Person::name)
                },
                buildAgeToNamesMap(list))

    }

    @Test
    fun test1Sample() = check(listOf(Person("Alice", 21),
            Person("Bob", 25), Person("Charlie", 25)))


    @Test
    fun test2() = check(listOf())

    @Test
    fun test3() = check(listOf(Person("Alice", 21), Person("Bob", 25)))

    @Test
    fun test4() = check(listOf(Person("Bob", 25), Person("Charlie", 25)))

    @Test
    fun test5() = check(listOf(
            Person("A", 10), Person("B", 10),
            Person("C", 20), Person("D", 20), Person("E", 20), Person("F", 20),
            Person("X", 30), Person("Y", 30), Person("Z", 30)
    ))
}