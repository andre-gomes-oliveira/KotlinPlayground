package Spices

fun main() {
    tasteSpices()
}

fun tasteSpices() {
    val spice = SimpleSpice()
    println(
        "Spice name: ${spice.name} \n" +
                "Spiciness: ${spice.heat()}"
    )

    val spices = listOf(
        Spice("curry", "light"),
        Spice("pepper", "mild"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "light"),
        Spice("red curry", "mild"),
        Spice("green curry", "spicy"),
        Spice("red pepper", "OMG")
    )

    //Creating a list of "weak" spices
    println(spices.filter { it.heat() <= 5 })

}
