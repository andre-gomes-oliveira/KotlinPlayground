package ingredients

//The abstract type became redundant once this class was declared as a sealed class
sealed class Spice(
    val name: String, private val spiciness: String = "mild",
    color: SpiceColor
) :
    SpiceColor by color {

    abstract fun prepareSpice()

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

    /**
     * Curry will be one of the possible concrete implementations of Spice
     * Since there can be multiple types of curry, this class takes a name and appens "Curry" to it
     * It also has a spiciness level that must be passed to it and a prepare function that grinds it
     *
     * Note: Since the Spice class became sealed, the Curry class had to be moved here
     */
    class Curry(curry: String, spiciness: String) :
        Spice(name = "$curry Curry", spiciness = spiciness, color = YellowSpiceColor),
        Grinder {
        override fun prepareSpice() {
            grind(name)
        }
    }
}
