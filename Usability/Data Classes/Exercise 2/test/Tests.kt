package dataClasses2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooksExample {
    @Test
    fun test2SimpleOneBookOneAuthor() {
        val book = Book("Book", listOf(Author("Author")))
        val list = listOf(book)
        Assert.assertEquals("Wrong result for $list:",
                mapOf(Author("Author") to listOf(book)),
                createAuthorToBooksMap(list))
    }

    @Test
    fun test2SimpleOneBookTwoAuthors() {
        val book = Book("Book", listOf(Author("first author"), Author("second author")))
        val list = listOf(book)
        Assert.assertEquals("Wrong result for $list:",
                mapOf(Author("first author") to listOf(book),
                        Author("second author") to listOf(book)),
                createAuthorToBooksMap(list))
    }

    @Test
    fun test2SimpleOneAuthorTwoBook() {
        val list = listOf(Book("first Book", listOf(Author("Author"))),
                Book("second Book", listOf(Author("Author"))))
        Assert.assertEquals("Wrong result for $list:",
                mapOf(Author("Author") to list),
                createAuthorToBooksMap(list))
    }

    @Test
    fun test1Sample() {
        val bruce = Author("Bruce Eckel")
        val chuck = Author("Chuck Allison")
        val dianne = Author("Dianne Marsh")
        val dmitry = Author("Dmitry Jemerov")
        val svetlana = Author("Svetlana Isakova")

        val first = Book("Computer Interfacing with Pascal & C", listOf(bruce))
        val second = Book("Using C++", listOf(bruce))
        val third = Book("C++ Inside & Out", listOf(bruce))
        val fourth = Book("Blackbelt C++: The Masters Collection", listOf(bruce))
        val thinkingInCPlusPlus = Book("Thinking in C++: Introduction to Standard C++", listOf(bruce))
        val thinkingInCPlusPlusVolume2 = Book("Thinking in C++, Vol. 2: Practical Programming", listOf(bruce, chuck))
        val thinkingInJava = Book("Thinking in Java", listOf(bruce))
        val flex = Book("First Steps in Flex", listOf(bruce))
        val atomicScala = Book("Atomic Scala", listOf(bruce, dianne))
        val onJava8 = Book("On Java 8", listOf(bruce))
        val kotlinInAction = Book("Kotlin in Action", listOf(dmitry, svetlana))
        val atomicKotlin = Book("Atomic Kotlin", listOf(bruce, svetlana))
        val books = listOf(
                first, second, third, fourth,
                thinkingInCPlusPlus,
                thinkingInCPlusPlusVolume2,
                thinkingInJava,
                flex,
                atomicScala,
                onJava8,
                kotlinInAction,
                atomicKotlin
        )
        val expected = mapOf(
                bruce to listOf(first, second, third, fourth,
                        thinkingInCPlusPlus, thinkingInCPlusPlusVolume2,
                        thinkingInJava, flex, atomicScala, onJava8, atomicKotlin),
                chuck to listOf(thinkingInCPlusPlusVolume2),
                dianne to listOf(atomicScala),
                dmitry to listOf(kotlinInAction),
                svetlana to listOf(kotlinInAction, atomicKotlin)
        )
        val actual = createAuthorToBooksMap(books)
        Assert.assertEquals("Wrong result for sample:", expected, actual)
    }
}
