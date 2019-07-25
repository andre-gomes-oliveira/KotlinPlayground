package Aquarium

fun main() {
    buildAquarium()
}

/**
 * Declaring an internal function to build an aquarium
 * Internal functions are only visible in the current package (similar to package-private in other Android projects)
 * In this case, the buildAquarium function can be accessed anywhere in the Aquarium package, but would not be exported in a lib
 *
 */
internal fun buildAquarium() {
    /*Calling the Aquarium constructor
    * Note that there is no need to use the "new" keyword
     */
    val myAquarium = Aquarium()

    /*Printing the values of the Aquarium attributes
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
}
