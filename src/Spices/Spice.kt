package Spices

class Spice(val name: String, val spiciness: String = "mild") {

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