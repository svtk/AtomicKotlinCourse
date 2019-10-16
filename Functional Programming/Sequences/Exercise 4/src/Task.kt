package sequencesExercise4

fun School.findFavouriteInstructorForStudent(student: Student): Instructor? =
    lessons
        .filter { student in it.students }
        .groupBy { it.instructor }
        .maxBy { (_, lessons) -> lessons.size }
        ?.key