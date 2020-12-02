// Sequences/Task4.kt
package sequencesExercise4

fun School.favoriteInstructor(student: Student): Instructor? =
  lessons
    .filter { student in it.students }
    .groupBy { it.instructor }
    .maxByOrNull { (_, lessons) -> lessons.size }
    ?.key