fun main(args: Array<String>) {
    //When passing arguments by name, I can switch the order
    println(whatShouldIDoToday(temperature = 30, mood = "sad"))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    // The when statement can act like a replacement for an if-else-if chain, pretty neat
    return when {
        mood == "happy" && weather == "sunny" -> "go for a walk."
        mood == "sad" && temperature in (10..19) -> "Stay home and read."
        weather == "sunny" && temperature >= 25 -> "Time to hit the beach."
        else -> "Time to sleep."
    }
}