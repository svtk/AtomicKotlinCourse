package sequences3

fun School.getAverageRatingForInstructor(instructor: Instructor): Double =
        lessons
                .filter { it.instructor == instructor }
                .flatMap { it.rating.values.asSequence() }
                .average()