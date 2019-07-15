package lambdas2

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestBooks {
    private fun checkBooks(books: List<Book>, authors: Set<Author>) {
        Assert.assertEquals("Wrong result for $books:", getAuthors(books), authors)
    }

    @Test
    fun test1Sample() {
        checkBooks(listOf(
                Book("The Philosopher's Stone", Author("J. K. Rowling")),
                Book("The Chamber of Secrets", Author("J. K. Rowling")),
                Book("The Prisoner of Azkaban", Author("J. K. Rowling")),
                Book("The Goblet of Fire", Author("J. K. Rowling")),
                Book("The Order of the Phoenix", Author("J. K. Rowling")),
                Book("The Half-Blood Prince", Author("J. K. Rowling")),
                Book("The Deathly Hallows", Author("J. K. Rowling"))
        ), setOf(Author("J. K. Rowling")))
    }

    @Test
    fun test2EmptyList() {
        checkBooks(listOf(), setOf())
    }

    @Test
    fun test3OneAuthor() {
        checkBooks(listOf(Book("Doctor Zhivago", Author("Boris Pasternak"))),
                setOf(Author("Boris Pasternak")))
    }

    @Test
    fun test4SeveralAuthors() {
        checkBooks(listOf(Book("For Whom the Bell Tolls", Author("Ernest Hemingway")),
                Book("The Old Man and the Sea", Author("Ernest Hemingway")),
                Book("One Hundred Years of Solitude", Author("Gabriel García Márquez"))),
                setOf(Author("Ernest Hemingway"), Author("Gabriel García Márquez")))
    }
}