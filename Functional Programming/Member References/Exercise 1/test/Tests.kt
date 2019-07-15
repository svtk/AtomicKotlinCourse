package memberReferences01

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import java.util.*

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestMapImpl {
    private fun check(
            list: List<Student>
    ) {
        Assert.assertEquals("Wrong result for $list:",
                list.sortedWith(compareByDescending(Student::grade)
                        .then(compareBy(Student::surname, Student::name))),
                list.sortByGradeAndThenByName())
    }

    @Test
    fun test1Sample() = check(listOf(
            Student("Alice", "Johnson", 3),
            Student("Bob", "Smith", 2),
            Student("Charlie", "Smith", 2)))

    @Test
    fun test2() = check(listOf(
            Student("Alice", "Johnson", 1),
            Student("Bob", "Smith", 1),
            Student("Charlie", "Smith", 1)))

    @Test
    fun test3() = check(listOf(
            Student("Bob", "Smith", 1),
            Student("Alice", "Smith", 1),
            Student("Charlie", "Smith", 1)))

    @Test
    fun test4() = check(listOf(
            Student("Bob", "Smith", 2),
            Student("Alice", "Smith", 3),
            Student("Charlie", "Smith", 1)))

    @Test
    fun test5() = check(listOf(
            Student("Alice", "Johnson", 1),
            Student("Alice", "Smith", 1),
            Student("Alice", "Jones", 1)))

    @Test
    fun test6() {
        val names = ('A'..'E').map { "$it" }
        val surnames = (1..6).map { "S$it" }
        val random = Random()
        repeat(20) {
            check(names.shuffled().zip(surnames.shuffled()).map { (name, surname) ->
                Student(name, surname, random.nextInt(4))
            })
        }
    }
}