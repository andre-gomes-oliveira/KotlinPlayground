package books

fun main() {
    val myBook = Book("Dear diary", "Me", 1995)
    val metadata = myBook.getMetadata()

    //It is possible to decompose the triple into independent variables
    val (title, author, year) = metadata
    println("The book $title has been written by $author on the year $year")

    //Creating an immutable set of books by William Shakespeare
    val shakespeareBooks = setOf("Gilgamesh", "The Story of Don Juan", "The tragedy of Hamlet")

    //Creating a map associatng the previous set to the author
    val library = mapOf("William Shakespeare" to shakespeareBooks)
    if (library.any { it.value.contains("Hamlet") })
        println("Hamlet is on the list")

    //Creating a map that can be changed and then adding values to it
    val moreBooks = mutableMapOf("William Shakespeare" to shakespeareBooks)

    //Adding values by accessing a key that doesn't exist
    moreBooks["Dan Brown"] = setOf("Inferno", "Da Vinci Code", "Digital Fortress")

    //Adding values bu using a helper function that checks if the key exists
    moreBooks.getOrPut("Homer") { setOf("The Odyssey") }

}