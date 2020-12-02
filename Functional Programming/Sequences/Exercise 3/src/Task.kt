// Sequences/Task2.kt
package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double =
  lessons
    .filter { it.instructor == instructor }
    .flatMap { it.rating.values.asSequence() }
    .average()