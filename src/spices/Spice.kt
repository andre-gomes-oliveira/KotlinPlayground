package spices

/**
 *  Basic declaration of a class in Kotlin
 *
 * Using val so that the value of these attributes can be changed
 * also declaring these attributes as private, so they can not be accessed by any other class
 */
class Spice(val name: String, private val spiciness: String = "mild") {

    /**
     * Using a heat variable similar to the one in SimpleSpice
     */
    val heat: () -> Int
        get() : () -> Int = {
            when (spiciness) {
                "light" -> 3
                "mild" -> 5
                "spicy" -> 7
                "OMG" -> 10
                else -> 0
            }
        }

    /**
     * Using an init blcok to print out the values of the Spice once it has been created
     */
    init {
        println("Name: $name \nSpiciness: $spiciness \nHeat:${heat()} \n")
    }

    fun makeSalt() = Spice(name = "Salt", spiciness = "light")

}