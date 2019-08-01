package ingredients

/**
 * Grinding is a proccess that can be used to prepare more than just Curry
 * Therefore, the grind function will be created in an interface
 */
interface Grinder {

    //The grind function will have a default implementation
    fun grind(ingredient: String) {
        println("Grinding $ingredient")
    }
}