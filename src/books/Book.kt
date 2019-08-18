package books

/**
 * Simple class that represents a book, with a title and an author
 */
open class Book(val title: String = "No title", val author: String = "Unknown", val year: Int) {

    //The last page the user has read, defaults to zero which the start of the book
    var currentPage: Int = 0

    //A function that reads a page, simply increment currentPage by 1
    open fun readPage() {
        currentPage++
    }

    //A function that will return a pair containing both the title and the author of the book
    open fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    //Kotlin has a special type called a Triple, it is possible to group together 3 values like the book metadata
    open fun getMetadata(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

/**
 * A subclass of book, wich adds a format for the e-Book
 */
class eBook(title: String, author: String, format: String = "text", year: Int) :
    Book(title = title, author = author, year = year) {

    /*
    * Overriding the readPage function since it should now measure words instead of pages
    * The average number of words in a page is 250, se we will go with that
    */
    override fun readPage() {
        currentPage += 250
    }
}

