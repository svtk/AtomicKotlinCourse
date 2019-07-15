package sequences2

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
class TestGettingInstructorOrStudent : TestSchool() {
    private fun checkInstructors(
            student: Student,
            schoolLessons: List<Lesson>,
            result: List<Char>
    ) {
        Assert.assertEquals("Wrong result for ${student.name}, " +
                "$schoolLessons:",
                result.map { inst(it) }.toSet(),
                schl(schoolLessons).getStudentInstructors(student))
    }

    private fun checkStudents(
            instructor: Instructor,
            schoolLessons: List<Lesson>,
            result: List<Int>
    ) {
        Assert.assertEquals("Wrong result for ${instructor.name}, " +
                "$schoolLessons:",
                result.map { st(it) }.toSet(),
                schl(schoolLessons).getStudentsOf(instructor))
    }

    @Test
    fun test1() {
        checkInstructors(st(1), listOf(lsn('A', 1)), listOf('A'))
    }

    @Test
    fun test2() {
        checkInstructors(st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 1)
        ), listOf('A', 'B'))
    }

    @Test
    fun test3() {
        checkInstructors(st(1), listOf(
                lsn('A', 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 4)
        ), listOf('B'))
    }

    @Test
    fun test4() {
        checkStudents(inst('A'), listOf(lsn('A', 1)), listOf(1))
    }

    @Test
    fun test5() {
        checkStudents(inst('A'), listOf(
                lsn('A', 1, 2),
                lsn('B', 1, 2, 3),
                lsn('A', 4)
        ), listOf(1, 2, 4))
    }

    @Test
    fun test6() {
        checkStudents(inst('C'), listOf(
                lsn('A', 2, 3),
                lsn('C', 1, 2),
                lsn('C', 1, 2),
                lsn('B', 1, 2, 3),
                lsn('C', 3)
        ), listOf(1, 2, 3))
    }
}