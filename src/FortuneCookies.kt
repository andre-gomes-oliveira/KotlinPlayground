fun main(args: Array<String>) {
    //Getting today's fortune and then using a string template to print it
    for (index in 1..10) {
        val fortune = getFortuneCookie()
        println("\nYour fortune is: $fortune")

        //Stop if the take it easy fortune was taken
        if (fortune.contains("Take it easy")) break
    }
}

fun getFortuneCookie(): String {
    /*
    * Creating an immutable list without specifying the type
    *  It could hold multiple different types, but I'll be using only strings
    */
    val fortunes = listOf("You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.", "" +
            "Take it easy and enjoy life!",
            "it is dangerous to go out alone, the night is dark and full of terrors",
            "Treasure your friends because they are your greatest fortune.")

    val birthday = getBirthday()

    //Since everything in Kotlin has a value, I can return the when result
    return when (birthday) {
        // Combining conditions
        0, in (32..Int.MAX_VALUE) -> "Hmm... funny guy/gal detected"
        23 -> "Same as me, you are a lucky champion :)"
        in (1..7) -> fortunes[birthday]
        in (8..14) -> fortunes[0]

        // It is possible co call functions even for primitive types in Kotlin
        in (15..21) -> fortunes[birthday.div(3)]

        // Using the 'rem' function to divide the birthday date and use the remainder as index
        else -> fortunes[getBirthday().rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    /*
*   Printing a message and capturing the user input
*   Using the safe '?' operator to get the nullable result from readLine()
*   Using toIntOrNull to safely convert the String to an Integer
*   Using the Elvis operator '?:' to return either the result or 1 in edge cases
*/
    print(message = "Would you kindly... tell me your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}