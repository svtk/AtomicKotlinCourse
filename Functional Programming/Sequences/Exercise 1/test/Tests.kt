package sequences1

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
class TestCommonLessons : TestSchool() {
    private fun check(
            instructor: Instructor,
            student: Student,
            schoolLessons: List<Lesson>,
            result: List<Int>) {
        Assert.assertEquals("Wrong result for ${instructor.name}, " +
                "${student.name}, $schoolLessons:",
                schoolLessons.filterIndexed { index, _ -> index in result },
                schl(schoolLessons).getCommonLessons(instructor, student).toList())
    }

    @Test
    fun test1() {
        check(inst('A'), st(1), listOf(lsn('A', 1)), listOf(0))
    }

    @Test
    fun test2() {
        check(inst('A'), st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 1)
        ), listOf(0, 2))
    }

    @Test
    fun test3() {
        check(inst('A'), st(1), listOf(
                lsn('A', 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 4)
        ), listOf())
    }
}