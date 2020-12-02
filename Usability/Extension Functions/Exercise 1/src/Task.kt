// ExtensionFunctions/Task1.kt
package extensionFunctionsExercise1

import atomictest.eq

fun String.wrapInTag(tagName: String): String = "<$tagName>$this</$tagName>"

fun main() {
  "cat".wrapInTag("animal") eq "<animal>cat</animal>"
}