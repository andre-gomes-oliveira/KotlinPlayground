package Aquarium

/**
 * Basic declaration of a class in Kotlin
 */
class Aquarium {

    /* Using var so that the value of these attributes can be changed
    * Note that if no visibility modifiers are explicitly declared, everything is public
     */
    var height: Int = 50
    var width: Int = 50
    var length: Int = 100

    /**
     * Demonstration of a funtion in a Kotlin class, this one simply calculates the volume opf the aquarium instance
     * Note that, since this is a simple expression, it can be written in one line like this
     * The "return" keyword is unnecessary
     *
     * @return The calculated volume of the Aquarium in litters
     */
    fun volumeFunction(): Int = height + width + length / 1000

    /** Another interesting concept is that users of this class don't really need to access a function, just a value
     * So a value can be used with an overwritten get function that actually calculates the volume, same as the above function
     * A set function can be defined in the same way, tis one calculates a new height by taking a value in litters and transforms it into cubic centimeters
     *
     */
    var volume: Int
        get() = height + width + length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
}