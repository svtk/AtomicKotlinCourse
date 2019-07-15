package operationsonCollections1

import atomictest.eq

data class Person(val name: String, val age: Int)

fun findOldest(people: List<Person>, requiredNumber: Int): List<String> {
    return people.sortedByDescending { it.age }
            .take(requiredNumber).map { it.name }.sorted()
}

fun main(args: Array<String>) {
    val people = listOf(
            Person("Bob", 30),
            Person("Charlie", 20),
            Person("Alice", 25))
    findOldest(people, 1) eq listOf("Bob")
    findOldest(people, 2) eq listOf("Alice", "Bob")
}