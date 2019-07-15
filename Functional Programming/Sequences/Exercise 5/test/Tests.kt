package sequences5

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

abstract class TestSchool {
    private val instructors = ('A'..'D')
            .map { it to Instructor("Instructor-$it") }
            .toMap()

    protected fun inst(c: Char) = instructors.getValue(c)

    private val students = (1..7)
            .map { it to Student("Student-$it") }
            .toMap()

    protected fun st(i: Int) = students.getValue(i)

    protected fun lsn(instructor: Char, vararg students: Int) =
            Lesson(inst(instructor), students.map { st(it) }.toSet(), mapOf())

    protected fun schl(lessons: List<Lesson>) =
            School(instructors.values.toSet(), students.values.toSet(),
                    lessons.asSequence())
}

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestLargestClass : TestSchool() {
    private fun checkInstructorsWithLargestClass(
            schoolLessons: List<Lesson>,
            instructors: List<Char>
    ) {
        Assert.assertEquals("Wrong result for $schoolLessons:",
                instructors.map { inst(it) }.toSet(),
                schl(schoolLessons).findInstructorsWithLargestClass())
    }

    @Test
    fun test1() {
        checkInstructorsWithLargestClass(listOf(lsn('A', 1)), listOf('A'))
    }

    @Test
    fun test2() {
        checkInstructorsWithLargestClass(listOf(lsn('A', 1, 2, 3), lsn('B', 1, 2)), listOf('A'))
    }

    @Test
    fun test3() {
        checkInstructorsWithLargestClass(listOf(lsn('A', 1, 2, 3), lsn('B', 1, 2, 3)), listOf('A', 'B'))
    }

    @Test
    fun test4() {
        checkInstructorsWithLargestClass(listOf(
                lsn('A', 1),
                lsn('B', 3),
                lsn('A', 1, 2),
                lsn('C', 3, 4)
        ), listOf('A', 'C'))
    }

    @Test
    fun test5() {
        checkInstructorsWithLargestClass(listOf(
                lsn('A', 1, 2, 3, 4),
                lsn('B', 1, 2, 3),
                lsn('A', 1),
                lsn('B', 2, 3, 5)
        ), listOf('A'))
    }

    @Test
    fun test6() {
        checkInstructorsWithLargestClass(listOf(
                lsn('A', 1, 2, 3),
                lsn('C', 1),
                lsn('B', 2, 3),
                lsn('A', 4),
                lsn('C', 1, 3)
        ), listOf('A'))
    }
}