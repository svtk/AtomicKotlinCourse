package extensionFunctions1

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestWrappingInATag {
    private fun checkWrapping(tagName: String, string: String) {
        Assert.assertEquals("Wrong result for $tagName:",
                "<$tagName>$string</$tagName>", string.wrapInTag(tagName))
    }

    @Test
    fun test1Sample() = checkWrapping("animal", "cat")

    @Test
    fun test2() = checkWrapping("data", "tag")
}