package creatingSequencesExercise1

fun School.commonLessons(
  instructor: Instructor,
  student: Student
): Sequence<Lesson> {
  return lessons.filter {
    instructor == it.instructor && student in it.students
  }
}