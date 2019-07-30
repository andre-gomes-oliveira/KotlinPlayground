package aquarium

import kotlin.math.PI

/**
 *  Basic declaration of a class in Kotlin
 *
 * Using var so that the value of these attributes can be changed
 *  Note that if no visibility modifiers are explicitly declared, everything is public
 *
 *  Now using the constructor to declare the variables and assign a default value, and declaring it as an open class
 *  The open keyword marks this class as capable of being inherited by other classes
 */
open class Aquarium(var height: Int = 50, var width: Int = 50, var length: Int = 100) {

    /**
     * Demonstration of a funtion in a Kotlin class, this one simply calculates the volume opf the aquarium instance
     * Note that, since this is a simple expression, it can be written in one line like this
     * The "return" keyword is unnecessary
     *
     * @return The calculated volume of the aquarium in litters
     */
    fun volumeFunction(): Int = height + width + length / 1000

    /** Another interesting concept is that users of this class don't really need to access a function, just a value
     * So a value can be used with an overwritten get function that actually calculates the volume, same as the above function
     * A set function can be defined in the same way, tis one calculates a new height by taking a value in litters and transforms it into cubic centimeters
     *
     * Note that the open keyword is also required in order to mark a function as overridable
     * otherwise we get compilation errors
     */
    open var volume: Int
        get() = height + width + length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    /**
     * Each property will be assigned in the order in which it is defined, here the value of water comes after volume
     * because the volume of the aquarium needs to be known prior to calculating how much water can fit in it
     *
     * Note that the open keyword is also required in order to mark an attribute as overridable
     * otherwise we get compilation errors
     */
    open var water = volume * 0.9


    /**
     * Specifying a different constructor is also possible in Kotlin
     * Note the use of the constructor keyword and the call to a default constructor at the end
     * Moreover, declaring var and val is not possible in secondary constructors
     */
    constructor(fishCount: Int) : this() {
        val water = fishCount * 2000 //cubic meters
        val tank = water * water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

/**
 * A simple subclass of aquarium that will override the water and volume attributes of the base class
 *
 */
class TowerTank() : Aquarium() {

    /*
     *  The override keyword is required in order to override a function of the base class
     * Kotlin requires explicit modifiers like these and it makes the code easily readable, since you can quickly spot
     * inherited functions and variables. Neat!
     */
    override var water = volume * 0.8

    override var volume: Int
        get() = (height + width + length / 1000 * PI).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }
}