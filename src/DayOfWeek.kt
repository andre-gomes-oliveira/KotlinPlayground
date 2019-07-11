import java.util.*

fun askDayOfWeek() {
    //Bonus point for those who get the game reference :)
    println("Would you kindly... tell me what day of the week it is?")
}

fun answerDayOfWeek() {
    //Declaring an immutable variable of the String type, which can be null
    val today: String?

    //Declaring an immutable variable , which cannot be nul
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    when (day) {
        1 -> today = "Sunday"
        2 -> today = "Monday"
        3 -> today = "Tuesday"
        4 -> today = "Wednesday"
        5 -> today = "Thursday"
        6 -> today = "Friday"
        7 -> today = "Saturday"
        else -> today = "houston, we have a problem!"
    }

    //Using a string template to get the result
    println(" Of course, today is $today")
}

fun main(args: Array<String>) {
    askDayOfWeek()
    answerDayOfWeek()
}

