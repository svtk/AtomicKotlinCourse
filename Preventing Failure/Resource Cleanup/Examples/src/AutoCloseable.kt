// ResourceCleanup/AutoCloseable.kt
import atomictest.eq
import checkinstructions.DataFile

fun main() {
  DataFile("Results.txt")
    .bufferedReader()
    .use { it.readLines().first() } eq
    "Results"
}