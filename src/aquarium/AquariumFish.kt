package aquarium

/**
 * Declaring an abstract class
 *
 * As usual, it is not possible to instantiate this class
 */
abstract class AquariumFish {

    //declaring an abstract property in Kotlin makes it mandatory to be overridden by sub-classes
    abstract val color: String
}

/**
 *  Also declaring an interface that will contain all the functions the fishes will do
 */
interface FishAction {

    //A basic function, every fish needs to eat right?
    fun eat()

    //An interface can also provide a default implementation of a function
    fun swim() {
        println("swim")
    }
}

/**
 *  The only real difference between an interface ad an abstract class is that the interface can not have a constructor
 *  Everything else is possible, even variables
 */
interface FishColor {
    val color: String
}

/**
 * Another important keyword to note is the object keyword
 * This is how we say that a class is going to have EXACTLY one instance
 * This is how you do a Singleton in Kotlin
 */
object GoldColor : FishColor {
    override val color: String
        get() = "Gold"
}

object WhiteColor : FishColor {
    override val color: String
        get() = "White"
}

object YellowColor : FishColor {
    override val color: String
        get() = "Yellow"
}

/**
 * Note the differences in how to use the abstract definitions above
 *
 *  Using a ":" to extend AquariumFish
 *  then using a "," to implement the interface
 */
class Shark : AquariumFish(), FishAction {
    //Overriding the color val and using the WhiteColor class to return the value
    override val color: String = WhiteColor.color

    //The shark will eat other fish
    override fun eat() {
        println("Hunt and eat fish")
    }

    //The shark will swim in a menacing way
    override fun swim() {
        println("Swim menacingly")
    }
}

class Plecostomus : AquariumFish(), FishAction {
    //Overriding the color val and using the GoldColor class to return the value
    override val color: String = GoldColor.color

    //The plecostomus simply eats algae and swims normally
    override fun eat() {
        println("Munch on algae")
    }
}

/**
 * Note that it is entirely possible to make a class simply implementing multiple interfaces
 * The syntax is the same as before
 *
 * Note the use of the by keyword, this means that we are delegating all calls to the color value to the YellowColor class
 */
class Comephorus() : FishAction, FishColor by YellowColor {

    override fun eat() {
        println("sift out fine organisms")
    }
}

/**
 * Yet another interesting possibility is to actually have the interface be a parameter
 * Here we are assigning a parameter fishColor and deferring any calls to the color function to it
 * Moreover, we can also pass in any other parameters as normal, as shown using the food here
 *
 * So this mysterious fish will have a color and eat function defined once it is instantiated, instead of defining it here
 */
class MysteriousFish(
    fishColor: FishColor = WhiteColor,
    val food: String = "Chomp, Chomp!"
) :
    FishAction, FishColor by fishColor {
    override fun eat() {
        println(food)
    }
}

