package extensionFunctions1

import atomictest.eq

fun String.wrapInTag(tagName: String): String = 
        "<$tagName>$this</$tagName>"

fun main(args: Array<String>) {
    "cat".wrapInTag("animal") eq "<animal>cat</animal>"
}