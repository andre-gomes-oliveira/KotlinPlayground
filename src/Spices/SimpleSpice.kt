package Spices

/**
 * A class that represents the spices used in earlier exercises
 *
 * @property name The name of the spice
 * @property spiciness The level of spiciness
 */
class SimpleSpice {

    var name: String = "curry"
    var spiciness: String = "mild"

    /**
     * Using a heat variable that will actually return a numeric value corresponding to the level of spiciness for calculations later
     */
    val heat: () -> Int
        get() : () -> Int = {
            when (spiciness) {
                "mild" -> 5
                "spicy" -> 7
                "OMG" -> 10
                else -> 0
            }
        }
}