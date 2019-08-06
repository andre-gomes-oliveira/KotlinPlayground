package aquarium.decorations

/**
 * Declaring a new class using the data keyword
 * This is a way to specify that this class does nothing more than hold data
 * It also comes with a few neat built-in functions
 */
data class Decoration(val rocks: String) {

}

data class ComplexDecoration(val rocks: String, val wood: String, val diver: String) {

}

fun makeDecorations() {

    //One neat built-in function is the toString() function
    val d1: Decoration = Decoration(rocks = "Granite")
    println(d1)

    //Another neat built-in function is an equal operator
    val d2: Decoration = Decoration(rocks = "Slate")
    val d3: Decoration = Decoration(rocks = "Slate")
    println(d1 == d2)
    println(d2 == d3)

    //The copy function is also generated
    val d4 = d1.copy()
    println(d4)

    //It is also possible to decompose a complex object into independent variables and then use them individually
    val d5: ComplexDecoration = ComplexDecoration("crystal", "wood", "diver")
    val (rock: String, wood: String, diver: String) = d5
    println(rock)
    println(wood)
    println(diver)
}

fun main() {
    makeDecorations()
}

