import java.lang.Math.random
import kotlin.random.Random

fun main() {
    //It is possible to assign a value OR a function to a variable
    val random1 = random()
    val random2 = { random() }

    //The first has a randomly generated value assigned to it
    repeat(5) {
        println(random1)
    }

    //The second actually has a function that will generate random values when called
    repeat(5) {
        println(random2())
    }

    //Assigning a random number generator that simulates a dice roll
    var rollDice = { Random.nextInt(1, 12) }

    println("\n calling the basic lambda")
    repeat(5) {
        println(rollDice())
    }

    //Now to test a lambda using a parameter provided by the user
    print(message = "How many sides should the new dice have?")
    var sides = 0

    while (sides == 0) {
        //If the user passes null, assign zero and try again
        val userInput = readLine()?.toIntOrNull() ?: 0
        if (userInput in (0..3)) {
            println("Very funny, but not really possible right?")
            continue
        } else if (userInput > 20) {
            println("Whoa there, this is just for fun, no need to get this serious!")
            continue
        }

        sides = userInput
    }

    rollDice = { Random.nextInt(1, sides) }

    println("\n Calling the new lambda with your value")
    repeat(5) {
        println(rollDice())
    }

    //Replacing the lambda with another one, declared using the function notation[
    val rollDice2 = { sides2: Int ->
        Random.nextInt(sides2) + 1
    }

    println("\n Using the function notation")
    repeat(5) {
        println(rollDice2(sides))
    }

    //Here is another way to create a lambda that will take a parameter using the function notation
    // This one also declares an specific parameter type, so note that slides does not need to be declared as an int
    // Type inference magic!!!

    val rollDice3: (Int) -> Int = { sides3 ->
        if (sides3 == 0) 0
        else Random.nextInt(sides3) + 1
    }

    println("\n Type inference magic")
    repeat(5) {
        println(rollDice3(sides))
    }

    //To wrar it up, passing the RollDice lambda to a function and checking it's return
    println("\n Calling the gamePlay function")
    repeat(5) {
        gamePlay(rollDice3(sides))
    }
}

//Creating a function that takes a lambda as a parameter
fun gamePlay(rollDice: Int) {
    println(rollDice)
}