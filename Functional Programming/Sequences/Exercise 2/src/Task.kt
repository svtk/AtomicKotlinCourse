// Sequences/Task2.kt
package sequencesExercise2

fun School.studentInstructors(
  student: Student
): Set<Instructor> {
  return lessons.filter {
    student in it.students
  }.mapTo(mutableSetOf()) { it.instructor }
}

fun School.studentsOf(
  instructor: Instructor
): Set<Student> {
  return lessons.filter {
    instructor == it.instructor
  }.flatMapTo(mutableSetOf()) { it.students.asSequence() }
}