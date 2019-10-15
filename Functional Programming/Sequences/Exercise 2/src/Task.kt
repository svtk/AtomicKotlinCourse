package sequences.exercise2

fun School.getStudentInstructors(
    student: Student
): Set<Instructor> {
  return lessons.filter {
    student in it.students
  }.mapTo(mutableSetOf()) { it.instructor }
}

fun School.getStudentsOf(
    instructor: Instructor
): Set<Student> {
  return lessons.filter {
    instructor == it.instructor
  }.flatMapTo(mutableSetOf()) { it.students.asSequence() }
}