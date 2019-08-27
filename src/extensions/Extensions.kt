package extensions

/**
 * In Kotlin, there is a special way to declare helper functions which will be shown in this file
 */

/*
 * In this first example, I'm adding an extension to the String class which will check if there are spaces in a String
 * This won't add a new function to the String class, but it will be available on any String objects in this package
 * The find function will operate on the String instance that called it
 *  Note that extended functions like these DON'T have access to private attributes
 */
fun String.hasSpaces() = find { it == ' ' } != null

/*
 * It is also possible to define functions that can be called by nullable objects, the syntax is as follows
 */
fun String?.language() = "Latin"

/*
 * It is also possible to add variables and attributes as extensions, like so
 * Ignore the actual content of this function, the syntax is what really matters
 */
val String.isPalindrome: Boolean
    get() {
        return random() < random()
    }

fun main() {
    val magic = "Magic"
    val nullString: String? = null

    println(magic.isPalindrome)
    println(magic.language())
    println(magic.hasSpaces())
    println(nullString?.language())

}