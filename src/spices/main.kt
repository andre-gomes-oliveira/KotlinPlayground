package spices

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
    val mildSpices = spices.filter { it.heat() <= 5 }
    mildSpices.forEach {
        println("Mild spice name: ${it.name}")
    }

    //Creating a SpiceContainter and quickly printing out the lavels
    spices.forEach {
        val container: SpiceContainer = SpiceContainer(it)
        println("Containter Label: ${container.label}")
    }
}
