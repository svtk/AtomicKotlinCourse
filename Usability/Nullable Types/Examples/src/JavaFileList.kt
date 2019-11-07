// NullableTypes/JavaFileList.kt
import java.io.File

fun main() {
    val f:File = File(".")
    val d:Array<String> = f.list()
    d.forEach { println("$it") }
}