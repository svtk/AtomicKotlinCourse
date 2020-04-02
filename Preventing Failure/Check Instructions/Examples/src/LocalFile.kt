// CheckInstructions/LocalFile.kt
package checkinstructions
import atomictest.eq
import java.io.File
import java.nio.file.Paths

fun localFile(name: String): File {
  val targetDir = File("LocalFiles")
  require(targetDir.exists()) {
    "$targetDir does not exist"
  }
  return targetDir.resolve(name)
}

fun main() {
  localFile("Test.txt") eq
    Paths.get("LocalFiles",
      "Test.txt").toString()
}