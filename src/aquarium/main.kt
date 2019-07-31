package aquarium

fun main() {
    //buildAquarium()
    //makeFishes()
    delegate()
}

/**
 * Declaring an internal function to build an aquarium
 * Internal functions are only visible in the current package (similar to package-private in other Android projects)
 * In this case, the buildAquarium function can be accessed anywhere in the aquarium package, but would not be exported in a lib
 *
 */
internal fun buildAquarium() {
    /*Calling the aquarium constructor
    * Note that there is no need to use the "new" keyword
     */
    val myAquarium = Aquarium()

    /*Printing the values of the aquarium attributes
    * Even though it looks like the attributes are being accessed directly, Kotlin actually created the getters and setters
    */
    println(
        "Height: ${myAquarium.height} \n" +
                "Width: ${myAquarium.width} \n" +
                "Lenght: ${myAquarium.length} \n"
    )

    //Changing a value and checking it, no need to explicitly call the getter and setter functions
    myAquarium.width = 25
    println("New width: ${myAquarium.width}")

    //Printing the volume in litters using a function call
    println("Volume in litters (funtion): ${myAquarium.volumeFunction()}")

    //Printing the volume in litters straight from an attribute
    println("Volume in litters (variable): ${myAquarium.volume}")

    //Using named parameters and a constructor to create a small aquarium and print it's volume
    val smallAquarium = Aquarium(length = 20, width = 15, height = 15)
    println("Volume in litters (small aquarium): ${smallAquarium.volume}")

    /**
     * Using the secondary constructor to build an aquarium
     * This constructor will specify the values of it's parameters using the number of fishes provided
     */
    val aquariumWithFishes = Aquarium(fishCount = 15)
    println("Volume in litters (with fishes): ${aquariumWithFishes.volume}")
    println(
        "Height: ${aquariumWithFishes.height} \n" +
                "Width: ${aquariumWithFishes.width} \n" +
                "Lenght: ${aquariumWithFishes.length} \n"
    )
}

internal fun makeFishes() {
    //Instantiating the concrete classes Shark and Plecostomus
    val shark = Shark()
    val plecostomos = Plecostomus()

    //Checking if they are properly different
    println("Shark color: ${shark.color} \nPlecostomus color: ${plecostomos.color}")
    feedTheFish(shark)
    feedTheFish(plecostomos)
}

/*
 * Here we say that this function receives an object that implements an specific interface
 * This is useful when we are only interested in using functions that were defined in an interface
 * It looks just like it would if we were specifying the class type of the parameter, we are simply using an interface instead
 *
 */
internal fun feedTheFish(fish: FishAction) {
    //Using the interface function, the type of fish is irrelevant in this scenario
    fish.eat()
}

/*
 * In this function we will use multiple interfaces to declare everything a fish can do
 */
internal fun delegate() {
    val comephorus = Comephorus()
    println("Fish color: ${comephorus.color} \n")
    comephorus.eat()

    val mystery = MysteriousFish(GoldColor, "Munch, Munch!")
    println("Fish color: ${mystery.color} \n")
    mystery.eat()
}
