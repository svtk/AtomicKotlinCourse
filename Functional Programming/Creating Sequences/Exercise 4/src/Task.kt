package creatingSequencesExercise4

fun School.favouriteInstructor(student: Student): Instructor? =
  lessons
    .filter { student in it.students }
    .groupBy { it.instructor }
    .maxBy { (_, lessons) -> lessons.size }
    ?.key