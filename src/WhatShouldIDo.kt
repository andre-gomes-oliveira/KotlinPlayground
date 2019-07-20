fun main() {
    //Time to ask the user for the parameters
    print(message = "Would you kindly... tell me your mood today?")
    val mood = readLine()!!

    print(message = "Would you kindly... tell me the temperature in Celsius?")
    val temperature = readLine()?.toIntOrNull() ?: 25

    print(message = "Would you kindly... tell me how is the weather?")
    val weather = readLine()!!

    //When passing arguments by name, I can switch the order
    println(whatShouldIDoToday(temperature = temperature, mood = mood, weather = weather))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    // The when statement can act like a replacement for an if-else-if chain, pretty neat

    return when {
        isInGoodMood(mood) && isGoodWeather(weather) && isHotTemperature(temperature) -> "Time to hit the beach."
        !isInGoodMood(mood) && !isGoodWeather(weather) && !isWarmTemperature(temperature) -> "Stay in bed"
        isInGoodMood(mood) && isGoodWeather(weather) -> "go for a walk."
        isInGoodMood(mood) && isWarmTemperature(temperature) -> "Stay home and read."
        else -> "Time to sleep."
    }
}

//A compact function declaration, the return can even be omitted since it does a simple operation
fun isInGoodMood(mood: String) = mood == "happy"

//A simple compact function as the previous one
fun isGoodWeather(weather: String) = weather == "sunny"

//A more complex function, cehcking if the value is in a range
//However, since it also is a simple operation, it can also be a compact function
fun isWarmTemperature(temperature: Int) = temperature in (20..25)

fun isHotTemperature(temperature: Int) = temperature in (26..35)