package constants

object Constants {

    //Constants must have their value assigned at compile time
    const val attribute1 = 1
}

class NotConstants {
    // Constants must be declared in top-level or objects like shown above, the following line gives an error in a class
    //const val attribute1 = 1
    val attribute2 = 1

    //It is possible, however, to define an inner object within a parent class an then declare a constant inside
    companion object {

        //This constant will be initialized by that static constructor of the containing class, when an instance is first used
        const val innerConstant = 0
    }
}

