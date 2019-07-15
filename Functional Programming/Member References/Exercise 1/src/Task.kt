package memberReferences01

import atomictest.eq

data class Student(
        val name: String,
        val surname: String,
        val grade: Int
) {
    override fun toString(): String {
        return "$name $surname ($grade)"
    }
}

fun List<Student>.sortByGradeAndThenByName(): List<Student> = sortedWith(
        compareByDescending(Student::grade)
                .then(compareBy(Student::surname, Student::name)))

fun main(args: Array<String>) {
    val people = listOf(
            Student("Alice", "Johnson", 1),
            Student("Bob", "Smith", 2),
            Student("Charlie", "Smith", 2))

    people.sortByGradeAndThenByName() eq
            "[Bob Smith (2), Charlie Smith (2), " +
            "Alice Johnson (1)]"
}