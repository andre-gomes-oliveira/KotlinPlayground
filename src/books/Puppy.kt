package books

import kotlin.random.Random

class Puppy {

    fun playWithBook(book: Book) {
        if (book.pages > 0)
            book.tornPages(Random.nextInt(1, 10))
    }
}