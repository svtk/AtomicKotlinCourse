// Interoperability/KotlinChecked.kt
import atomictest.eq
import java.io.File

fun main() {
  File("DataFiles/file_real.txt")
    .readLines()[0] eq
    "wubba lubba dub dub"
}