// LocalFunctions/ReturnInsideLambda.kt
import localfunctions.*
import atomictest.eq

fun main() {
  sessions.any { session ->
    if (session.title.contains("Kotlin") &&
      session.speaker in favoriteSpeakers) {
      return@any true
    }
    // ... more checks
    false
  } eq true
}