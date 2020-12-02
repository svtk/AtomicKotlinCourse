// ImportanceOfLambdas/Task2.kt
package theImportanceOfLambdasExercise2
import atomictest.eq

fun filterNonBlank(strings: List<String>): List<String> {
  return strings.filter { it.isNotBlank() }
}

fun main() {
  filterNonBlank(listOf("", "a", "  ")) eq listOf("a")
}