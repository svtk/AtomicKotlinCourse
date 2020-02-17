package destructuringDeclarationsExercise1

fun calculate(n1: Int, n2: Int): Triple<Boolean, Int, Int> {
    return if (n1 < 0 || n2 < 0) Triple(false, 0, 0)
    else Triple(true, n1 + n2, n1 * n2)
}
