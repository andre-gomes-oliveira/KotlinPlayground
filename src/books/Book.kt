package books

//Testing out constants by declaring a maximum number of books to be borrowed
const val maxBookCount = 10

/**
 * Simple class that represents a book, with a title and an author
 */
open class Book(val title: String = "No title", val author: String = "Unknown", val year: Int) {

    //Creating a companion object to hold constant values
    companion object Constants {
        const val BASE_URL = "https://www.somesafeurl.com/"
    }


    //The last page the user has read, defaults to zero which the start of the book
    var currentPage: Int = 0

    // A variable that informs the number of pages in the book
    var pages: Int = 0

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

    //This function will tell weather another book can be borrowed
    fun canBorrow(bookCount: Int): Boolean {
        return bookCount.minus(maxBookCount) <= 0
    }

    //This function accesses both a constant value and a variable to print out the "URL" for the book
    fun printURL() {
        println("$BASE_URL$title.html")
    }
}

/**
 *  Book extensions
 */

//Extended variable, calculates the weight based on the number of pages
val Book.weight: Double
    get() {
        return pages * 1.5
    }

//Extended function that torns down pages from the book
fun Book.tornPages(pagesTorn: Int = 0) {
    if (pages >= pagesTorn)
        pages -= pagesTorn
    else
        pages = 0
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

