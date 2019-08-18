package constants

import java.lang.Math.random
import kotlin.math.roundToInt

// Declaring an immutable variable and assigning a value at a compile time
const val constantNumber = 10


fun main() {
    //There is a key difference between const and val, which is shown below
    //A val is immutable, but can have it's value set at runtime, like this:
    val number = random().roundToInt()
    println("The random value was $number")

    //A const is immutable and must have it's value assigned at compile time, this line gives an error due to that
    //const val anotherConstantNumber = random().roundToInt()


}
