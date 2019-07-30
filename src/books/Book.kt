package books

/**
 * Simple class that represents a book, with a title and an author
 */
open class Book(val title: String = "No title", val author: String = "Unknown") {

    //The last page the user has read, defaults to zero which the start of the book
    var currentPage: Int = 0

    //A function that reads a page, simply increment currentPage by 1
    open fun readPage() {
        currentPage++
    }
}

/**
 * A subclass of book, wich adds a format for the e-Book
 */
class eBook(title: String, author: String, format: String = "text") :
    Book(title = title, author = author) {

    /*
    * Overriding the readPage function since it should now measure words instead of pages
    * The average number of words in a page is 250, se we will go with that
    */
    override fun readPage() {
        currentPage += 250
    }
}

