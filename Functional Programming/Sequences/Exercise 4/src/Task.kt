// Sequences/School2.kt
package sequencesExercise4

fun School.favouriteInstructor(student: Student): Instructor? =
  lessons
    .filter { student in it.students }
    .groupBy { it.instructor }
    .maxByOrNull { (_, lessons) -> lessons.size }
    ?.key