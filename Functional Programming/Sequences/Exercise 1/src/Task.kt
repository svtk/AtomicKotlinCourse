package sequences.exercise1

fun School.getCommonLessons(
    instructor: Instructor,
    student: Student
): Sequence<Lesson> {
  return lessons.filter {
    instructor == it.instructor && student in it.students
  }
}