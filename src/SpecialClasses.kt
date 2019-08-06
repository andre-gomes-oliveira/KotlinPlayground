//This file highlights 3 special types of classes that have built-in functionality that reduces boiler plate code

//The object Keyword can be used to create a Singleton class, Kotlin handles the Singleton logic under the hood
object MobyDick {

    val author: String = "Hermam Melville"
}

//The enum keyword is used to declare enumerator classes
enum class Color(val color: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//The sealed keyword declares a class that can only be extended in the same file that it is declared in
// This is ideal when all sub-types of this class must be known at compile time
sealed class Seal() {}

//These classes would create a compile error outside this file
class SeaLion : Seal() {}

class Walrus : Seal() {}