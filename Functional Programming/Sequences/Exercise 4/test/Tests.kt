package sequences4

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
class TestFavouriteInstructor : TestSchool() {
    private fun checkFavouriteInstructor(
            student: Student,
            schoolLessons: List<Lesson>,
            favInstructor: Instructor?
    ) {
        Assert.assertEquals("Wrong result for ${student.name}, " +
                "$schoolLessons:",
                favInstructor,
                schl(schoolLessons).findFavouriteInstructorForStudent(student))
    }

    @Test
    fun test1() {
        checkFavouriteInstructor(st(1), listOf(lsn('A', 1)), inst('A'))
    }

    @Test
    fun test2() {
        checkFavouriteInstructor(st(2), listOf(lsn('A', 1)), null)
    }


    @Test
    fun test3() {
        checkFavouriteInstructor(st(1), listOf(lsn('A', 1), lsn('B', 1)), inst('A'))
    }

    @Test
    fun test4() {
        checkFavouriteInstructor(st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('B', 1, 2, 3),
                lsn('A', 1)
        ), inst('A'))
    }

    @Test
    fun test5() {
        checkFavouriteInstructor(st(1), listOf(
                lsn('A', 1, 2, 3),
                lsn('C', 1),
                lsn('B', 2, 3),
                lsn('A', 4),
                lsn('C', 1, 3)
        ), inst('C'))
    }
}