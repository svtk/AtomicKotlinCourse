package fromListstoMaps03

import atomictest.eq

fun <T, R> List<T>.associateBy(keySelector: (T) -> R): Map<R, T> =
        groupBy(keySelector).mapValues { it.value.last() }

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 21),
            Person("Bob", 25), Person("Charlie", 25))

    people.associateBy(Person::name) eq ""
}