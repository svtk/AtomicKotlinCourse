## Nullable Types (#2)

Access Java's `File` class by importing `java.io.File`. Create a `File` object,
passing it the name of the current directory. Now call `list()` on the `File`
object; this returns an `Array<String>` which you can display on the console.

{{ I thought this would produce a compile-time error because list() can return
   null, but it doesn't seem to:

```kotlin
// NullableTypes/JavaFileList.kt
import java.io.File

fun main() {
    val f:File = File(".")
    val d:Array<String> = f.list()
    d.forEach { println("$it") }
}
```
}}